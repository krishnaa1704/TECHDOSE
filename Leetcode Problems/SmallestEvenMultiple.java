class Solution {
    public int smallestEvenMultiple(int n) {
        int a=0;
        if(n%2!=0){
            a=n*2;
        }
        if(n%2==0){
            a=n;
        }
        return a;
    }
}