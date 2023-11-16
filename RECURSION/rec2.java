//Print name N times using recursion
package RECURSION;
public class rec2 
{
    public static void main(String[] args) 
    {
        int n=5;
        name(1,n);
    }
    static void name(int i,int n)
    {
       if(i>n)
       {
         return;
       }
       System.out.println("anjali");
       name(i+1,n) ;  
     }
}
