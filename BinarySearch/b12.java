//Search Single Element in a sorted array
//ist approch
 
public class b12
{
   public static void main(String[] args)
   {
     int[]arr={1,1,2,2,3,4,4,4};
     int n =arr.length;
      int ans=sorted(arr,n);
      System.out.println(ans);
   } 
   static int sorted(int[]arr,int n)
   {
     if(n==1)
     {
        return arr[0];
     }
     for(int i=0;i<n;i++)
     {
        if(i==0)
        {
            if(arr[i]!=arr[i+1])
            {
                return arr[i];
            }
        }
        else if(i==n-1)
        {
            if(arr[i]!=arr[i-1])
            {
                return arr[i];
            }
        }
        else
        {
            if(arr[i]!=arr[i+1]&&arr[i]!=arr[i-1])
            {
                return arr[i];
            }
        }
     }
     return 0;
   }
   
   
}



