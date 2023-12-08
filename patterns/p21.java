public class p21
{
    public static void main(String[] args) 
    {
        int n=4;
            
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
        
            for(int k=1;k<=2*(n-i);k++)
            {
                System.out.print(" ");
         
            }
           
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
             
            System.out.println();
        }
          for(int l=n;l>=1;l--)
        {
            
            for(int j=1;j<=l;j++)
            {
                System.out.print("*");
            }
        
            for(int k=1;k<=2*(n-l);k++)
            {
                System.out.print(" ");
         
            }
           
            for(int j=1;j<=l;j++)
            {
                System.out.print("*");
            }
             System.out.println();
        }
    }}



























































































































































































































































































