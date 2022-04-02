class Solution {
    public int countPrimes(int n) {
        boolean[] array = new boolean[n + 1];
        int countPrime = 0;
        Arrays.fill(array, true);
        for(int i = 2; i * i < n; i++) {
            if(array[i] == true) {
                for(int j = i * i; j <= n; j+=i)
                    array[j] = false;
            }
        }
        for(int i = 2; i < n; i++){
            if(array[i] == true)
                countPrime++;
        }
        return countPrime;
        
    }
}