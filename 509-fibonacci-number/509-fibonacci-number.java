class Solution {
    public int fib(int N) {
        if(N == 0)
            return 0;
        int[] lastTwo = {1, 1};
        int counter = 3;
        while(counter <= N) {
            int nextFib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFib;
            counter +=1;
        }
        return lastTwo[1];
        
        
    }
}

