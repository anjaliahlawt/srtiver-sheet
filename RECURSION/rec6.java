//factorial of n number using recursion

package RECURSION;

public class rec6 
{
    
    public static void main(String[] args)
    {
      int n=5;
       int c=factorial(n);  
      System.out.println(c);
    }
    static int factorial(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        return n* factorial(n-1);
    }
}


