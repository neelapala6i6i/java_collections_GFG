class Solution {
    public boolean isStringExist(String s, String[] arr) {
        // code here
       
     for(int i=0;i<arr.length;i++)
     {
         String s1=arr[i];
         if(s.length()==arr[i].length())
         {
              int c=0;
             for(int j=0;j<s.length();j++)
             {
                  if(s.charAt(j) != s1.charAt(j))
                  c++;
             }
             if(c==1)
             {
                 return true;
             }
        
         }
     }
 
     return false;
    }
}