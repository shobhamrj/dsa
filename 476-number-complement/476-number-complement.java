class Solution {
    public int findComplement(int num) {
        int res = 0;
        int pow = 1;
        while(num > 0) {
            res += (num % 2 ^ 1) * pow;
            pow <<= 1;
            num >>=1;
            
        }
        return res;
    }
}