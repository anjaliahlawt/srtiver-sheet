
//write a java program to find the sum og digits of guiven number

public class p3
{
   public static void main(String[] args)
   {
     int digit=123;
     int count=0;
     while(digit>0)
     {
        int rem=digit%10;
        count=count+rem;
        digit=digit/10;
     }
    System.out.println(count);
   } 
}











