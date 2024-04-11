//write a java program to find the roots of quadratic equation


//package assignments;

public class p1
{
   public static void main(String[] args)
   {
     double a=2.3,b=4,c=5.6;
     double r1,r2;
     double d=(b*b)-(4*a*c);
     if(d==0)
     {
        System.out.println("roots are real and equal");
        r1=r2=-b/(2*a);
        System.out.println(r1);
        System.out.println(r2);
     }
     else if(d>0)
     {
        System.out.println("roots are real and distict");
        r1=(-b+Math.sqrt(d))/(2*a);
        r2=(-b-Math.sqrt(d))/(2*a);
        System.out.println(r1);
        System.out.println(r2);
     }
     else
     {
        System.out.println("roots are distict and complex");
        double x=-b/(2*a);
        double y=Math.sqrt(-d)/(2*a);
        System.out.println("r1"+" "+" "+x +" " +"+i"+" "+y);
        System.out.println("r1"+" "+x+" "+ "-i"+" "+y);
     }
   } 
}
