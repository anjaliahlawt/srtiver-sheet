public class s2
{
    public static void main(String[]args)
    {
        int []arr={2,5,1,8,2,9,1};
        int n =arr.length;
        int k=3;
        int sum = 0;
        for(int i=0;i<k;i++)
        {
            sum += arr[i];
        }
        int maxsum=sum;
        int max=Integer.MIN_VALUE;
   
        for(int j=k;j<n-1;j++)
        {
            sum=sum+arr[j];
            sum=sum-arr[j-k];
             max=Math.max(maxsum,sum);
          
        }
        System.out.println(max);
    }
}
