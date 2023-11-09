public class ptr17 
{
   public static void main(String[] args)
    {
       String a="anjali";
       int length=a.length();
       int sum=0;
       for(int i=0;i<length;i++)
       {
         sum=sum+ a.charAt(i);
       }
       System.out.println(sum);
    } 
}
