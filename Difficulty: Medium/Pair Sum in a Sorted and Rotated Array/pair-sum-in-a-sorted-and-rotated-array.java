
class Solution {
    static boolean pairInSortedRotated(int nums[], int target) {
        // Your code here
        HashMap<Integer,Integer> hm=new HashMap<>();
              for(int i=0;i<nums.length;i++)
              {
               int x=target-nums[i];
               if(hm.containsKey(x))
               {
                   return true;
               }
               hm.put(nums[i],i);
              }


              return false;
    
    }
}
