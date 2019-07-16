class Solution {
    public int divide(int dividend, int divisor) {
        
        //This is a log(n) Solution
        
        if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        
        long sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        
        long dividendAbs = Math.abs((long)dividend);
        long divisorAbs = Math.abs((long)divisor);
        
        long temp = 0, quotient = 0;
        
        //Check from the highest bit to the lowest bit, and add up values for the valid bit.
        //1L is used to handle the case of 1 << 31, which gives incorrect result.
    
        for(int i = 31; i >= 0; i--){
            
            if(temp + (divisorAbs << i) <= dividendAbs){
                
                temp += divisorAbs << i;
                quotient |=  1 << i;
            }
        }
        
        return (int) (sign * quotient);
    }
}
