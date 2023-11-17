//find gcd in two number

package basic;

public class ba4
{
    public static void main(String[] args) 
    {
        int num1=4,num2=8;
        int ans=1;
        for(int i=1;i<=Math.min(num1,num2);i++)
        {
            if(num1%i==0&&num2%i==0)
            {
               ans=i;
            }
           
        }
         System.out.println("the gcd of the two number " +ans);
    }
}
