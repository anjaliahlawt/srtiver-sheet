
import java.util.*;
public class b5 
{
    public static void main(String[] args)
     {
          
        int[]arr={1,6,7,9,13};
        int n =5;
        int x=4;
        int []ans=getfloorceil(arr,n,x);
        System.out.print("floor is"+ans[0]+"ceil is"+ans[1]);


    }
    static int floor(int[]arr,int n ,int x)
    {
       int start=0,end=n-1,ans=-1;
       while(start<=end)
       {
        int mid=(start+end)/2;
        if(arr[mid]<=x)
        {
            ans=arr[mid];
            start=mid+1;
        }
        else
        {
            end=mid-1;
        }
       }
       return ans;
    }

    static int ceil(int[]arr,int n ,int x)
    {
       int start=0,end=n-1,ans=-1;
       while(start<=end)
       {
        int mid=(start+end)/2;
        if(arr[mid]>=x)
        {
            ans=arr[mid];
            end=mid-1;
        }
        else
        {
            start=mid+1;
        }
       }
       return ans;
    }

   public static int[] getfloorceil(int[]arr,int n,int x)
    {
       int f=floor(arr,n,x);
       int c=ceil(arr,n,x);
       return new int[]{f,c};
    }
}
