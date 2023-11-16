//Print 1 to N using Recursion

//package RECURSION;

public class rec3
{
    public static void main(String[] args)
    {
        int n=6;
        number(1,n);
    }
    static void number(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println(i);
        
        number(i+1,n);
    }
}
