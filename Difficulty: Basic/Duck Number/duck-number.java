class Solution {
    static boolean check_duck(String n) {
        // code her
    
       if(n.lastIndexOf("0")==-1||n.lastIndexOf("0")==0)
         return false;
        for(int i=0;i<n.lastIndexOf("0");i++)
        {
             if(n.charAt(i)!='0')
                return true;
        }
       
       
        return false;
        
    }
}