class Solution {
    public String largestOddNumber(String num) {
        int index = num.length()-1;
        while(index>=0){
            int digit = Integer.valueOf(num.charAt(index));
            if(digit%2!=0){
                return num.substring(0,index+1);
            }
            index--;
        }
        return "";
    }
}