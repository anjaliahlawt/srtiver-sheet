// write a program to convert binary number to decimal number
/* 
public class p4 
{
    public static void main(String[] args) 
    {
        String binary="01011011";
        int decimal=Integer.parseInt(binary,2);
        System.out.println("the decimal number of "+binary+""+"="+decimal);
    }
}
*/
 class p4
 {
    public static void main(String[] args) 
    {
        long num=110110111;
        int d=convertdecimal(num);
        System.out.println(d);

    }
    static int convertdecimal(long num)
    {
        int dn=0;int i=0;
        long rem;
        while(num!=0)
        {
            rem=num%10;
            num=num/10;
            dn+=rem*Math.pow(2,i);
            ++i;
        }
        return dn;
    }
 }