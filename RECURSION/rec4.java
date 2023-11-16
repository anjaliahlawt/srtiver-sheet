//: Print from N to 1 using Recursion

package RECURSION;

public class rec4
 {
    public static void main(String[] args) 
    {
        int n=5;
        number(n,1);
    }
    static void number(int n,int i)
    {
        if(i>n)
        {
            return ;
        
        }
        System.out.println(n);
        number(n-1,1);
    }
}
