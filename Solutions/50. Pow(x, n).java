class Solution {
    public double binaryExp(double x, long n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 1.0/binaryExp(x,-n);
        }
        if(n%2!=0){
            return x*binaryExp(x*x,n/2);
        }else{
            return binaryExp(x*x,n/2);
        }
    }
    public double myPow(double x, int n) {
        return binaryExp(x,(long)n);
    }
}