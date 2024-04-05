//Implement Lower Bound=smallest index such taht the arr[i]>=x

//package BinarySearch;
 class b2
 {
    public static void main(String[] args) 
    {
        int arr[]={3,5,8,15,19};
        int n =arr.length;
        int x=9;
         int result=lower(arr, n ,x);
         System.out.println(result);
    }
    static int lower(int[]arr,int n ,int x)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=x)
            {
                return i;
            }
        }
        return n ;
    }
 }




/*class b2
{
    public static void main(String[] args)
    {
        int arr[]={3,5,8,15,19};
        int n=arr.length;
        int x=9;
       int ans= lower(arr, n, x);
       System.out.println(ans);
    }
    static int lower(int[]arr,int n,int x)
    {
       int start=0,end=n-1;
       int ans=n;
       while(start<=end)
       {
         int mid=(start+end)/2;
         if(arr[mid]>=n)
         {
            ans=mid;
            end=mid-1;
         }
         else
         {
            start=mid+1;
         }
       }
       return ans;
       
    }
}*/