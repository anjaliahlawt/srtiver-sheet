//Find the missing number in an array
//method 1
/* 
public class a17 
{
    public static void main(String[] args) 
    {
        int []arr={1,2,4,5,6};
        int n=5;
        int result=missing(arr,n);
        System.out.println(result);
    }
    static int missing(int[]arr,int n)
    {
      for(int i=1;i<=n;i++)
      {
        int flag=0;
      
      for(int j=0;j<n-1;j++)
      {
         if(arr[j]==i)
         {
            flag=1;
            break;
         }
      }
      if(flag==0)
      {
        return i;
      }
    }
    return -1;
    
}
}
*/

//method 2:
/* 
public class a17
{
    public static void main(String[] args) 
    {
        int[]arr={1,2,3,5,6};
        int n=5;
        int result=missing(arr,n);
        System.out.println(result);
    }
    static int missing(int []arr,int n){
        int sum=n*(n+1)/2;
        int s=0;
        for(int i=0;i<n-1;i++)
        {
             s=s+arr[i];
        }
        return sum-s;
    }
}
*/