//Count digits in a number

package basic;

public class ba1
{
    public static void main(String[] args) 
    {
        int n=1234578459;
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
}
}