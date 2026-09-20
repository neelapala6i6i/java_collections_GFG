class Solution {
    public boolean isProduct(int[] a, long target) {
        // code here
      Arrays.sort(a);
      int start=0;
      int end=a.length-1;
      while(start<end)
      {
          long p=1L*a[start]*a[end];
          if(p<target)
             start++;
          else if(p>target)
             end--;
          else
            return true;
      }
      return false;
    }
}