public class prt12 
{
    public static void main(String[] args) 
   {
        for(int i=1;i<=4;i++)
       { 
            int count=1;
           for(int j=1;j<=i;j++)
           {
             System.out.print(count);
             count++;
           }
          for(int k=1; k<=2*(4-i);k++)
          {
            System.out.print(" ");
          }
      
         for(int j=i;j>=1;j--)
         {
            System.out.print(j);
         }
         System.out.println();
       }
    }

}