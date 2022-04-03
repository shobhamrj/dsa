class Solution {
    public int bitwiseComplement(int N) {
        if(N == 0) return 1;
        int res = 0;
        int pow = 1;
        while(N > 0) {
            res += (N % 2 ^ 1) * pow;
            pow <<= 1;
            N >>=1;
            
        }
        return res;
        
    }
}