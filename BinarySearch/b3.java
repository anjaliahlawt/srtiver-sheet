public class b3
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
