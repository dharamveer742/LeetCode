class Solution {
    public String reverseWords(String s) {
        int index=0;
        String ans="";
        while(index<s.length()){
            int spaceIndex = s.indexOf(" ",index);
            if(spaceIndex==-1){
                spaceIndex=s.length();

            }
            String temp=s.substring(index,spaceIndex);
            if(!temp.contains(" ") && temp.length()!=0){
                ans=temp+" "+ans;
                index=spaceIndex+1;
            }
            else{
                index++;
            }
            

        }
        return ans.substring(0,ans.length()-1);
    }
}