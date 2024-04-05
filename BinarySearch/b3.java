//upper bound=smallest index such that arr[i]>x

/*public class b3
{
    public static void main(String[] args)
     {
         int []arr={1,2,2,3};
         int n =arr.length;
         int x=2;
        int ans=upper(arr,n,x);
        System.out.println(ans);

    }
    static int upper(int[]arr,int n ,int x)
    {
      for(int i=0;i<n;i++)
      {
        if(arr[i]>x)
        {
            return i;
        }
      }
      return n;
    }
}
*/

class b3
{
    public static void main(String[] args) 
    {
        int[]arr={3,5,8,9,15,19};
        int n =arr.length;
        int x=9;
        int result=upper(arr,n,x);
        System.out.println(result);
    }
    static int upper(int[]arr,int n,int x)
    {
        int start=0,end=n-1;
        int ans=n;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]>x)
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
}