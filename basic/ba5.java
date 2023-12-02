package basic;

public class ba5
 {
    public static void main(String[] args)
    {
       int n=170,rem,arm=0;
       int c;
       c=n;
      
       while(n>0)
       {
            rem=n%10;
            arm=rem*rem*rem+arm;
            n=n/10;
       }
       if(c==arm){
         System.out.println("is an armstrong"+arm);

       }
       else{
         System.out.println("is not armstrong"+arm);
       }
    }
    
}
















