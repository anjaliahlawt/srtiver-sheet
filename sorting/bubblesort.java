public class bubblesort
{
    public static void main(String[] args) 
    {
        int[]arr={13,46,13,24,52,20,9};
        int n =arr.length;
        System.out.println("Before bubble sort ");
        for(int k=0;k<n;k++)
        {
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        sorting(arr,n);
    }
    static void sorting(int[]arr,int n)
    {
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<=i-1;j++)
            {
                if(arr[j]>=arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("after bubble sort");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
