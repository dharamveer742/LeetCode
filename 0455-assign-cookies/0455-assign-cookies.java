class Solution {
   
        public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int i = g.length-1;
        int j = s.length-1;
        int count =0;
        while(i>=0 && j>=0){
            if(s[j]>=g[i]){
                count=count+1;
                j--;
            }
            i--;
        }
        return count;
    }
    
}