//fibonacci series withot using while loop 
public class a10
{
    public static void main(String[] args) 
    {
        int n=5;
       
        fibonnaci(n);

    }
    static void fibonnaci(int n)
    {     
        int a=0;
        int b=1;int c=0;
        int count=0;
        while(count<n)
        {
            System.out.print(a);
           c=a+b;
           a=b;
           b=c;
         count=count+1;
        }
    }

}