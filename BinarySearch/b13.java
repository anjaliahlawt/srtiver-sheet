//Peak element in Array
/* 
public class b13
{
   public static void main(String[] args) 
   {
      int arr[] = {1,2,1,3,5,6,4};
      int n =arr.length;
      int ans=  peak(arr,n);
      System.out.println(ans);
   }
      static int peak(int[]arr,int n)
        {
           for(int i=0;i<n;i++)
      
           {
             if(arr[i]>arr[i+1])
              {
                 return i;
              }
           }
           return -1;
        }
      
 } 
  */
  
  class b13
  {
   public static void main(String[] args) 
   {
      int[]arr={1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
      int n=arr.length;
      int ans=peak(arr,n);
      System.out.println(ans);
   }
   static int peak(int[]arr,int n)
   {
      if (n == 1) return 0;
      if (arr[0] > arr[1]) return 0;
      if (arr[n - 1] > arr[n - 2]) return n - 1;
      int start=1;int end=n-2;
      while(start<=end)
      {

       int mid=(start+end)/2;
      
       if(arr[mid-1]<arr[mid]&&arr[mid]>arr[mid+1])
       {
         return mid;
       }
       if(arr[mid]>arr[mid-1])
       {
         start=mid+1;
       }
   }
   return -1;
  }

  }