import java.util.Arrays;

public class a11
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5};
       
       int n=arr.length-1;
        int temp=arr[0];
       for(int i=1;i<=n;i++)
       {
          arr[i-1]=arr[i];
       }
       arr[n]=temp;
       System.out.println(Arrays.toString(arr));

    }
}
