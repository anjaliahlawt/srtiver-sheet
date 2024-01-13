
//Check if a string is palindrome or not
public class a9
{
    public static void main(String[] args) 
      {
           String str="abba";
           boolean result=ReverseArray(str);
           if(result==true)
           {
              System.out.println("is  palindrome"+result);
           }
          else
          {
             System.out.println("is not palindrome"+result);
          }
      } 
    static boolean ReverseArray(String str)
   {
      int start=0;
      int end=str.length()-1;
      while(start<end)
      {
         if(str.charAt(start)!=str.charAt(end))
         {
            return false;
         }
         start++;
         end--;
      }
      return true;
   }
}












