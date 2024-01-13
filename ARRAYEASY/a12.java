// left Rotate  array by K elements
//method 1
/* 
import java.util.*;
public class a12
 {
    public static void main(String[] args) 
    {
        int[]arr={3,7,8,9,10,11};
        int n=arr.length;
        int k=3;
        rotate(arr,n,k);
         for(int i=0;i<n;i++)
         {
          
         }
          System.out.println(Arrays.toString(arr));
     }
    

    static void rotate(int[]arr,int n,int k)
    {
        int []temp=new int[n];
        int d=0;
        for(int i=k;i<n;i++)
        {
            temp[d]=arr[i];
            d++;
        }
        for(int i=0;i<k;i++)
        {
            temp[d]=arr[i];
            d++;
        }
          for(int i=0;i<n;i++)
        {
            arr[i]=temp[i];
            
        }
    
    }
     
    
}
*/
//method 2:reverse
import java.util.*;
public class a12
{ 
    public static void main(String[] args) 
    {
       int []arr={3,7,8,9,10,11};
       int length=arr.length;
       int k=3;
       rotate(arr,length,k);
       System.out.println(Arrays.toString(arr));
    }  
    static void reverse(int[]arr,int start,int end)
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
    static void rotate(int []arr,int length,int k)
    {
       reverse(arr,0,k-1);
       reverse(arr,k,length-1);
       reverse(arr,0,length-1);
    }
 }

