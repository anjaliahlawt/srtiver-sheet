//Finding Sqrt of a number using Binary Search
/* 
public class b14 
{
    public static void main(String[] args) 
    {
        int n =28;
        int ans=1;
        for(int i=1;i<=n;i++)
        {
            if(i*i<=n)
            {
                ans=i;
                
            }
            else
             break;
        }
        System.out.println(ans);
    }
}
*/

class b14
{
    public static void main(String[] args)
    {
       int n =28;
       int ans=sqrt(n);
       System.out.println(ans);
        
    }
    static int sqrt(int n)
    {
       int ans=1;
       int start=0;int end=n-1;
       while(start<=end)
       {
         int mid=(start+end)/2;
         if(mid*mid<=n)
         {
            ans=mid;
            start=mid+1;
         }
         else
         {
            end=mid-1;
         }
       }
       return ans;
    }
}






























