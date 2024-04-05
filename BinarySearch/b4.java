//Search Insert Position

/*public class b4 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,4,7};
        int n =arr.length;
        int x=6;
        int ans=index(arr,n,x);
        System.out.println(ans);
        
    }
    static int index(int []arr,int n ,int x)
    {
        for(int i=0;i<=n;i++)
        {
            if(arr[i]>=x)
            {
                return i;
            }
           
        }
        return n;
    }
    
}
*/
class b4
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,2,4,7};
        int n =arr.length;
        int x=6;
        int result=index(arr,n,x);
        System.out.println(result);

    }
    static int index(int[]arr,int n,int x)
    {
        int start=0;int end=n-1;
        int ans=n;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]>=x)
            {
              ans=mid;
              end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return ans;
    }
}