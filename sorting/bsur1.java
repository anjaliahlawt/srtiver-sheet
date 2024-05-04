//bubble sort using recusrion

class bsur1
{
    public static void main (String[] args)
    {
        int arr[]={13,25,9,7,12};
        int n =arr.length;
        bubblesort(arr,n);
        System.out.println("after bubble sort");
        for(int i=0;i<n;i++)
        {
           System.out.print(arr[i]+" ");
        }
    }
    static void bubblesort(int[]arr,int n)
    
        {
        if(n==1)
        return;
        for(int j=0;j<=n-2;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1]; 
                arr[j+1]=temp;

            }
        }
        bubblesort(arr,n-1);
    }

}