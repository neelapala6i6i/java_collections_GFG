class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
     int l=0;
     int r=arr.length-1;
     while(l<r)
     {
         int sum=arr[l]+arr[r];
         if(sum==target)
         {
            al.add(l+1);
            al.add(r+1);
            return al;
         }
         else if(sum<target)
         {
             l++;
         }
         else
         {
             r--;
         }
     }
     al.add(-1);
      al.add(-1);
        return al;
    }
}