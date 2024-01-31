public class insertionsort
{
    public static void main(String[] args)
    {
       int[]arr={13,46,24,52,20,9};
       int n =arr.length;
       System.out.println("Before insertion sort");
       for(int j=0;j<n;j++)
       {
         System.out.print(arr[j]+" ");
       }
       for(int i=0;i<=n-1;i++)
       {
         int j=i;
         while(j>0&&arr[j-1]>arr[j])
         {
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
         }
       } 
       System.out.println();
       System.out.println("After insertion sort");
       for(int k=0;k<n;k++)
       {
         System.out.print(arr[k]+" ");
       }
    }
}
