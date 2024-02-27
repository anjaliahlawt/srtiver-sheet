//merge sort

import java.util.*;

public class mergesort{
  public static void main(String[] args) 
   {
     int []arr={6,3,9,5,2,8};
     int n =arr.length;
     System.out.println("before merge sort");
     for(int i=0;i<n;i++)
     {
       System.out.print(arr[i]+" ");
     }
     System.out.println();
     divide(arr,0,n-1);
     System.out.println("after merge sort");
     for(int i=0;i<n;i++)
     {
       System.out.print(arr[i]+" ");
     }
     System.out.println();

   }

    static void conquer(int[]arr,int start,int mid,int end)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int indx1=start;
        int indx2=mid+1;
        while(indx1<=mid && indx2<=end)
        {
           if(arr[indx1]<=arr[indx2])
           {
             temp.add(arr[indx1]);
             indx1++;
           }
           else
           {
             temp.add(arr[indx2]);
             indx2++;
           }
        }
           while(indx1<=mid)
           {
             temp.add(arr[indx1]);
             indx1++;
           }
           while(indx2<=end)
           {
             temp.add(arr[indx2]);
             indx2++;
           }
           for (int i = start; i <= end; i++) {
             arr[i] = temp.get(i - start);
         }
    }
      
 
   static void divide(int[]arr,int start,int end)
   { 
       if(start>=end)
        return;
       
       int mid=(start+end)/2;
       divide(arr,start,mid);
       divide(arr,mid+1,end);
       conquer(arr,start,mid,end);
   }
  
}
  

  