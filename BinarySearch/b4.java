public class b4 
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
