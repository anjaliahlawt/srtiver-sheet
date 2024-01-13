//Longest Subarray with given Sum K(Positives)

//method 1
/* 
public class a20
{
    public static void main(String[] args)
    {
       int[]arr={2,3,5,1,9};
       int n=arr.length;
       int l=10;
       int len=0;
       for(int i=0;i<n;i++)
       {
           long d=0;
         for( int j=i;j<n;j++)
         {
          
            d=d+arr[j];
         
         if(d==l)
        {
            len=Math.max(len,j-i+1);
         }
         
      } }
       System.out.println("the length of longest subaaray is"+len);
    }
}
*/

//method 2;

public class a20
{
   public static void main(String[] args) 
   {
      int[]arr={-1,1,1};
      int k=1;
      int result=longest(arr,k);
      System.out.println(result);
   }
      static int longest(int[]arr,int k)
      { int n=arr.length;
         int i=0,j=0;
         int max1=0;
         long sum=arr[0];
         while(j<n)
         { 
           
             while(i<=j&&sum>k)
            {
               sum=sum-arr[i];
               i++;
            }
            if(sum==k)
            {
               max1=Math.max(max1,j-i+1);
            }
            j++;
            if(j<n)
            
               sum=sum+arr[j];
            
         }
         return max1;
         
     }
     
}