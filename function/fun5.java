//Write a function that takes in the radius as input and returns the circumference of a circle.
package function;

public class fun5 
{
    public static void main(String[] args) 
    {
          double r=3;
          double ans=circumferce(r);
          System.out.println(ans);
    }
    static double circumferce(double r)
    {
        double cir=2*3.14*r;
         return cir;
    }
    
}
