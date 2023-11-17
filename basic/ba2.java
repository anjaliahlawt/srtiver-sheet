//reverse a number
package basic;

public class ba2 
{
    public static void main(String[] args) 
    {
        int n=123;
        int rem;
        int rev=0;
        while(n!=0)
        {
             rem=n%10;
             rev=rev+rem;
             n=n/10;
             System.out.print(rem);
        }
       
    }
}
