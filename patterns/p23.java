public class p23 
{
    public static void main(String[] args) 
    {
        int n=6;
         int count=1;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++)
            {
               System.out.print(count+" ");
               
            }
            count++;
            System.out.println();
        }
    }
}
