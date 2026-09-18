class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] a) {
        // code here
        Arrays.sort(a);
        ArrayList<ArrayList<Integer>> al=new  ArrayList<ArrayList<Integer>>();
         int l=0;
         int r=a.length-1;
         while(l<r)
         {
             int sum=a[l]+a[r];
             if(sum==0)
             {
                 al.add(new ArrayList<>(Arrays.asList(a[l],a[r])));
                   int x1=a[l];
                 int x2=a[r];
                 l++;
                 r--;
               
            while(l<r  && a[l]==x1)
             {
                 l++;
             }
             while(l<r  && a[r]==x2)
             {
                r--;
             }
         }
         else if(sum<0)
         {
             l++;
         }
         else
         {
             r--;
         }
       
    }
      return al;
    }
}
