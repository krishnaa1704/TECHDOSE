class Solution {
    public boolean checkDistances(String s, int[] d) {
        int[] v= new int[26];
        Arrays.fill(v,-1);
        for(int i=0;i<s.length();i++){
            int idx= s.charAt(i)-'a';
            //fALSE - if was seen already and distance from last occurence is not equal to distance given 
            if(v[idx]!=-1 && (i-v[idx]-1)!=d[idx]) return false;
            v[idx]=i;  //UPDATE THE LATEST INDEX
        }
        return true;
    }
}