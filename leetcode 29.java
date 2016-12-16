public class Solution {
    public int divide(int dividend, int divisor) {
        long m = dividend;  
        long n = divisor;  
        if(m/n>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return dividend/divisor;
    }
}