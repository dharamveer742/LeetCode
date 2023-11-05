
class Solution {
   
       public boolean isPalindrome(String s) {
           if(s==null){
               return false;
           }
           if(s.length()==0){
               return true;
           }
           int low=0;
           int high=s.length()-1;
           while(low<high){
               if(!isAlphaNumeric(s.charAt(low))){
                   low++;
                   
               }
               else if(!isAlphaNumeric(s.charAt(high))){
                   high--;
                   
               }
               else if(isEqualSameCase(s.charAt(low),s.charAt(high))){
                    low++;
                    high--;
               }
                else{
                    return false;
                }     
           }
           return true;
                  
        }
                  
        boolean isAlphaNumeric(char c){
            return (c>='a' && c<='z') || (c>='A'&& c<='Z') || (c>='0' && c<='9');
        }
    
        boolean isEqualSameCase(char c1 ,char c2){  
            if(c1==c2){
                return true;
            }
            else if(c1>='A' && c1+32==c2){  
                return true;
            }
            else if(c1>='a' && c1-32==c2){
                return true;
            }
            else{
                return false;
        }
    }
}