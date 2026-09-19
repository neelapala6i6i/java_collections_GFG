class Solution {
    int countPairs(int arr[], int target) {
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
                        int c1=0;
                        int c2=0;

                         int x1=arr[l];
                         int x2=arr[r];
                         while(l<=r &&x1==arr[l])
                         {

                             l++;
                             c1++;
                         }
                         if(x1==x2)
                       {
                           c+=c1*(c1-1)/2;
                       }
                       else
                       {
                        
                         while(l<=r &&x2==arr[r])
                         {

                             r--;
                             c2++;
                         }
                            c+=c1*c2;
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