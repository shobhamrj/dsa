class Solution {
    
    public double myPow(double x, int n) {
        if(x == 0 && n <= 0)
            throw new ArithmeticException("undefined");
        double result = positivePower(Math.abs(x), Math.abs(n));
        if(n < 0)
            result = 1/result;
        if(x<0 && n%2!=0)
            result = -1 * result;
        return result;
    }
    
    public static double positivePower(double x, int power){
        if(power==0)
            return 1;
        if(power==1)
            return x;
        double halfPower = positivePower(x, power/2);
        if(power%2 == 0)
            return halfPower * halfPower;
        else
            return x * halfPower * halfPower;
        
    }
}