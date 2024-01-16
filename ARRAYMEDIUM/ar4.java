//package ARRAYMEDIUM;

public class ar4 
{
    public static void main(String[] args) 
    {
        int []arr={-2,1,-3,4,-1,2,1,-5,4};
        int n =arr.length;
        int ans=maximumsum(arr,n);
        System.out.println(ans);
    }
    static int maximumsum(int[]arr,int n)
    {
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
               int sum=0;
               for(int k=i;k<=j;k++)
               {
                  sum=sum+arr[k];
               }
               max1=Math.max(max1,sum);
            }
        }
        return max1;
    }
}
