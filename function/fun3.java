//Write a function to print the sum of all odd numbers from 1 to n.
package function;

public class fun3
 {
    public static void main(String[] args) 
    {
        int n=12;
        int ans=odd(n);
        System.out.println(ans);
    }
    static int odd(int n)
    { 
        int sum=0;
        for(int i=1;i<=n;i++)
        {
           if(i%2!=0)
           {
               sum=sum+i; 
           }
        }
        return sum;
    }
}
