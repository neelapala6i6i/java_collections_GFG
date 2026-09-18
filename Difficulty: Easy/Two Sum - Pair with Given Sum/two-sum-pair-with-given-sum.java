class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<=n-1;i++)
        {
            int s2=target-arr[i];
            if(hm.containsKey(s2))
            {
                return true;
            }
            hm.put(arr[i],i);
        }
        return false;
        
    }
}