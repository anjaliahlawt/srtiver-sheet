//right rotate array in k element
import java.util.*;
public class a13
 {
    public static void main(String[] args)
    {
        int []arr={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=2;
        rotate(arr,n,k);
        System.out.println(Arrays.toString(arr));
        
            
        }
        static void reverse(int []arr,int start, int end)
        {
           while(start<=end)
           {
              int temp=arr[start];
              arr[start]=arr[end];
              arr[end]=temp;
              start++;
              end--;
           }
        }
        static void rotate(int []arr,int n,int k)
        {
            reverse(arr,0,n-k-1);
            reverse(arr,n-k,n-1);
            reverse(arr,0,n-1);
        }

    }




