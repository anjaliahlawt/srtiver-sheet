//Sum of first N Natural Numbers

//package RECURSION;

public class rec5
{
    public static void main(String[] args)
    {
      int n=7;
       int c=sum(n);  
      System.out.println(c);
    }
    static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+ sum(n-1);
    }
}
