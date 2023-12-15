//Enter 3 numbers from the user & make a function to print their average.
package function;

public class fun2
{
    public static void main(String[] args) 
    {
        // Scanner input=new Scanner(System.in);
        // System.out.println("enetr the value of a b and c");
        // int a=input.nextInt();
        // int b=input.nextInt();
        // int c=input.nextInt();
        int a=2,b=4,c=5;
        int ans=average(a,b,c);
        System.out.println(ans);

    }
    static int average(int a,int b,int c)
    {
        int total=a+b+c;
        int avg=total/3;
        return avg;
    }
}
