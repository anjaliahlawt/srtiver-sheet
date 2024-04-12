// write a program to convert binary number to decimal number

public class p4 
{
    public static void main(String[] args) 
    {
        String binary="01011011";
        int decimal=Integer.parseInt(binary,2);
        System.out.println("the decimal number of "+binary+""+"="+decimal);
    }
}
