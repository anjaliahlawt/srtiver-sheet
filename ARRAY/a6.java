import java.util.*;
public class a6 
{
    public static void main(String[] args)
    {
        int []arr={1,2,3,4,5};
        int n=arr.length;
        int i;
        int temp=arr[0];
        for(i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
            
    }
     arr[n-1]=temp;
      System.out.println(Arrays.toString(arr));
     
}
}