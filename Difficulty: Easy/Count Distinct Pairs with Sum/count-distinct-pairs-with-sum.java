class Solution {
    static int countDistinctPairs(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int c=0;
        int l=0;
             int r=arr.length-1;
             while(l<r)
             {
                 
                 int sum=arr[l]+arr[r];
                 if(sum==target)
                 {
                  c++;
                   
                   int x1=arr[l];
                   int x2=arr[r];
                   while(l<r &&x1==arr[l])
                   {
                      
                       l++;
                   }
                   while(l<r &&x2==arr[r])
                   {
                      
                       r--;
                   }
                  
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
              return c;
    }
}
