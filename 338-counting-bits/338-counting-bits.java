class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for(int i = 0; i <= num; i++) {
            int curr = i;
            int count = 0;
            while(curr > 0) {
                curr &= (curr-1);
                count++;
            }
            res[i] = count;
        }
        return res;
    }
}