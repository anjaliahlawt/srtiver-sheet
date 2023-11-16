//Recursive code for printing numbers from 0 to 3 : 
 
package RECURSION;
public class rec1 
{
    public static void main(String[] args) 
    {
        int count=0;
        print(count);
    }
    static void  print(int count)
    {
         if(count>3)
         {
            return;
         }
         System.out.println(count);
         count++;
         print(count);
    }
}
