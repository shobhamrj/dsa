class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];
        for(int i: arr) {
            int rem = i % k;
            if(rem < 0)
                rem += k;
            freq[rem]++;
        }
        
        for(int rem = 0; rem <= k/2; rem++) {
            if(rem == 0){
                if(freq[rem] % 2 != 0)
                    return false;
            } else {
                if(freq[rem] != freq[k - rem])
                    return false;
            }
        }
        return true;
        
    }
}