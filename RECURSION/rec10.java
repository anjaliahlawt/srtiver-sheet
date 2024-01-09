public class rec10 
{
    
    public static void main(String[] args)
    {
       int n=10,count=0;
       for(int i=1;i<=n;i++)
       {
       for(int j=1;j<=i;j++)
       {
          if(i%j==0)
          {
                 count++;
          }
       }
       if(count==2) 
       {
        System.out.println(i+"is prime number");
       }
       else {
        System.out.println(i+"is not prime number");
       }
       }
    }

}