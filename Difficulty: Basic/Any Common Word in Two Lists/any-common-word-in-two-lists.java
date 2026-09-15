class Solution {
    public boolean commonString(String[] s, String[] t) {
        // code here
        for(int i=0;i<s.length;i++)
        {
            for(int j=0;j<t.length;j++)
            {
                if(s[i].equals(t[j]))
                {
                    return true;
                }
            }
        }
        return false;
    }
}