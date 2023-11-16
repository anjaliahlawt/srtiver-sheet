//fibonacii series print using recursion
public class rec9
 {  static int a=0,b=1,c=0;
    public static void main(String[] args) 
    {  
        int n=5;
        System.out.print(a+""+b);
        fibonnaci(n-2);
    }
    static void fibonnaci(int n)
    { 
       if(n>0)
       {
          c=a+b;
          a=b;
          b=c;
          System.out.print(c);
          fibonnaci(n-1);
       }
    }
}
