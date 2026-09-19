class Solution {
    int countPairs(int nums[], int target) {
        //  Code Here
        int c=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
                     for(int i=0;i<nums.length;i++)
                     {
                      int x=target-nums[i];
                      if(hm.containsKey(x))
                      {
                         c+=hm.get(x);
                      }
                      hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
                     }


                     return c;
    }
}
