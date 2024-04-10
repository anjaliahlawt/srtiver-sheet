//Minimum in Rotated Sorted Array
/* 
public class b10 
{
    public static void main(String[] args) 
    {
        int[]arr={5,6,7,8,-1,0,1,2,3};
        int n =arr.length;
        int min=0;
        for(int i =0;i<n;i++)
        {
            if(arr[i]<=min)
            {
               
               min=arr[i];
                System.out.println(arr[i]);
            }
        }
    }
}
*/
/* 
import java.util.*;

class b10{
    public static int findMin(int []arr) {
        int n = arr.length; 
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) 
        {
          
            mini = Math.min(mini, arr[i]);
        }
        return mini;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findMin(arr);
        System.out.println("The minimum element is: " + ans );
    }
}

*/
import java.util.*;
class b10
{
    public static void main(String[] args) 
    {
        int[]arr={5,6,7,8,1,2,3};
        int n =arr.length;
        int ans=min(arr,n);
        System.out.println(ans);
    }
    static int min(int[]arr,int n)
    {
        int ans=Integer.MAX_VALUE;
        int start=0;int end=n-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[start]<=arr[mid])
            {
                ans=Math.min(ans,arr[start]);
                start=mid+1;
            }
            else
            {
                ans=Math.min(ans,arr[mid]);
                end=mid-1;
            }
        }
        return ans;
    }
}