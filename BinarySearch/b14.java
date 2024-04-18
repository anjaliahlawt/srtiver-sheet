//Finding Sqrt of a number using Binary Search

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































