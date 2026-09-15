class Solution {
    public boolean isGoodString(String s) {
        // code here
 
       
        for(int i=0;i<s.length()-1;i++)
        {
          char c1=s.charAt(i);
          char c2=s.charAt(i+1);
          if(Math.abs(c1-c2)!=1&&Math.abs(c1-c2)!=25)
          {
              return false;
          }
        }
        
        return true;
    }
}