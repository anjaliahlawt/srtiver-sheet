public class isur1
{
    public static void main(String[] args) 
    {
        int arr[]={13,12,5,6,2,17};
        int n =arr.length;
        insertionsort(arr,0,n);
        System.out.println("after using insertion sort");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    static void insertionsort(int[]arr,int i,int n)
    {
        if(i==n)
        return;
        int j=i;
        while(j>0&&arr[j-1]>arr[j])
        {
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
        }
        insertionsort(arr,i+1,n);

    }
}
