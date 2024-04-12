// write a program to find the number is  prime or not 
/* 
public class p5 
{
    public static void main(String[] args)
    {
        int n =5;
        int count=0;
       for(int i=1;i<=n;i++)
       {
           if(n%i==0)
         {
            count++;
         }
       }
       if(count==2)
       {
         System.out.println(n+ "is a prime number");
       }
       else
       {
         System.out.println(n+ "is not a prime number");
       }
    }
}
*/

// write a program to display all prime number 1to n
class p5
{
  public static void main(String[] args)
  {
    int n=5;
    int counter;
    for(int i=2;i<=n;i++)
    {
      counter=0;
      for(int j=1;j<=i;j++)
      {
        if(i%j==0)
        {
          counter++;
        }
      }
      if(counter==2)
      {
        System.out.println(i+"is prime number");
      }
      else
      {
        System.out.println(i+"is not prime number");
      }
    }
  }
}



