class Solution {
    public String snakeCase(String s) {
        // code here
        s=s.toLowerCase().replaceAll(" ","_");
        return s;
        
    }
}