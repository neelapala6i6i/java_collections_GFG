class Solution {
    public boolean hasTripletSum(int a[], int t) {
        // code Here
        Arrays.sort(a);
        int n=a.length;
        for(int i=0;i<n-2;i++)
        {
            int l=i+1;
            int r=n-1;
            
            while(l<r)
            {
                int x=a[l]+a[r]+a[i];
                if(x==t)
                  return true;
                else if(x<t)
                {
                    l++;
                }
                else
                  r--;
            }
        }
        return false;
    }
}
