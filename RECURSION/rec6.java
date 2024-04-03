//factorial of n number using recursion

//package RECURSION;

 class rec6
{
   public static void main(String[] args)
   {
    
    int result=factorial(7);
    
     System.out.println(result);
     
   }

   static int factorial(int n)
   {
     if(n==1)
     return 1;
     int ans=n* factorial(n-1);
     return ans;
   }
}


