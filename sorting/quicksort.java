public class quicksort
{
    public static void main(String[] args)
    {
       int[]arr={6,2,5,1,4,2,3};
       int n =arr.length; 
       System.out.println("before quicksort");
       for(int i=0;i<n;i++)
       {
         System.out.print(arr[i]+" ");
       }
       System.out.println();
       Quick(arr,0,n-1);
       System.out.println("after quicksort");
       for(int i=0;i<n;i++)
       {
          System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
    static void Quick(int[]arr,int start,int end)
    { 
        if(start>=end)
        return;
        int pivot=partition(arr,start,end);
        Quick(arr,start,pivot-1);
        Quick(arr,pivot,end);
    }
    static int partition(int[]arr, int start,int end)
    {
        int postion=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[i]<=arr[end])
            {
                int temp=arr[i];
                arr[i]=arr[postion];
                arr[postion]=temp;
                postion++;
            }
        }
        return postion-1;
    }
}
