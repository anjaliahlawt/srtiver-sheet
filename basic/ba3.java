//palindrome a number
package basic;

public class ba3 
{
    public static void main(String[] args) 
    {
        int n =1214;
        int rem;
        int rev=0;
        int c=n;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(c==rev)
        {
             System.out.print("is aplindrome"+rev);
        }
        else
        {
            System.out.print("is not palindrome"+rev);
        }
    }
}
