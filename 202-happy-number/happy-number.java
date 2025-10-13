class Solution {
    public boolean isHappy(int n) {
        int i=0;
        while(true){
            n=Sum(n);
            if(n==1) return true;
            if((i>1)&&(n==2 || n==4 || n==7 || n==9)) return false;
            i++;
        }
    }
    static int Sum(int n){
        int sum=0;
        while(n>0){
            int digit =n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
}