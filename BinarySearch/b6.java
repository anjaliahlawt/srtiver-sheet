//Last occurrence in a sorted array

public class b6
{
    public static void main(String[] args) 
    {
        int[]arr={1,3,4,4,13,13,15};
        int n =arr.length;
        int target=1;
         int ans=occurence(arr,n,target);
         System.out.println(ans);
    }
    static int occurence(int []arr,int n ,int target)
    {
        int ans=-1;
        
        for(int i=n-1;i>0;i--)
        {       
             if(arr[i]==target)
            {
               
                return i;
            } 
        }
        return ans;
    } 
}
