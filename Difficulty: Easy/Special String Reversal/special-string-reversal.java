class Solution {
    public String reverseString(String s) {
        // code here
        int start=0;
                int end=s.length()-1;

                char[] s1=s.toCharArray();
                while(start<end)
                {
                    if(!Character.isLetter(s1[start]))
                   {
                       start++;

                   }
                   else if(!Character.isLetter(s1[end])){
                       end--;
                   }
                   else
                   {
                       char t=s1[start];
                       s1[start]=s1[end];
                       s1[end]=t;
                       start++;
                       end--;
                   }


                }
                return new String(s1);
    }
}