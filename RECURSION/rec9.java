//fibonacii series print using recursion
class rec9
{
   public static void main(String[] args) 
   {
      int result=fibonacci(5);
      System.out.println(result);
      
   }

   static int fibonacci(int n )
   {
      if(n==0||n==1)
      return n ;
      return fibonacci(n-1)+fibonacci(n-2);
   }
}
