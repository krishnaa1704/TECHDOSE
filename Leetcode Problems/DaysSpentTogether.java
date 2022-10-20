class Solution {
 
        int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int countDaysTogether(String s1, String e1, String s2, String e2) {
    int[] a = new int[]{ getVal(s1), getVal(e1) };
    int[] b = new int[]{ getVal(s2), getVal(e2) };
    if(b[0]>a[1] || a[0]>b[1]) return 0;  // no overlap
    
    int start = Math.max(a[0], b[0]);
    int last = Math.min(a[1], b[1]);
    return last-start+1;
}

// convert date to nth day of year, (1st-365th day)
int getVal(String str){
    int idx = 0;
    int mon = (str.charAt(0)-'0')*10+(str.charAt(1)-'0');
    int day = (str.charAt(3)-'0')*10+(str.charAt(4)-'0');
    for(int i=1; i<mon; i++) idx += months[i-1]; // or use prefix sum
    return idx+day;
}
        
    
}