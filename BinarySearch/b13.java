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
      

