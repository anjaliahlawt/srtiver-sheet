//Print all Divisors of a given Number
package basic;

public class ba6 
{
    public static void main(String[] args)
    {
        int n=97,i;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println("it is divisible by n"+i);
            }
        }
    }
}
