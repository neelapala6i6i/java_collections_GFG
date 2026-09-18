class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        // code here
        List<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
                int n=arr.length;
                for(int i=0;i<=n-1;i++)
                {
                    int s2=target-arr[i];
                    if(hm.containsKey(s2))
                    {
                        al.add(s2);
                       al.add(arr[i]);
                    }
                    hm.put(arr[i],i);
                }
                return al;
    }
}