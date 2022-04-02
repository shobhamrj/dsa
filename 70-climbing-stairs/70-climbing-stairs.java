class Solution {
        
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return csMemo(n, memo);
    }
    
    public int csMemo(int n, int[] memo) {
        if(n == 0) 
            return memo[n] = 1;
        
        if(memo[n] != 0) 
            return memo[n];
            
        int ans = 0;
        ans += csMemo(n - 1, memo);
        
        if(n - 2 >= 0) 
            ans += csMemo(n - 2, memo);
        
        return memo[n] = ans;
    }
    
}