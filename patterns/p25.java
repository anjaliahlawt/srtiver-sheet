public class p25 
{
    public static void main(String[] args) 
    {
        int ch=65;
        int i,j,k,m;
        int n=5;
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=i;k++)
            
                System.out.print(ch++);
                ch--;
            for(m=1;m<i;m++)
            System.out.println(--ch);
        }
    }
}
