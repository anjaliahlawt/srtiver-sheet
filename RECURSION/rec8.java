//Check if a string is palindrome or not using recursion

public class rec8
 {
    public static void main(String[] args) 
    {
        
    
        String str="sir";
      boolean result=  ReverseArray(str,0,2);
  
        System.out.println(result);
    
}
    static boolean ReverseArray(String str,int start,int end)
    {
        
        if(start>=end){
            return true;
        }
      if(str.charAt(start)!=str.charAt(end))
           {
              return false;
           }
      return ReverseArray(str,start+1,end-1);
      
        }
       

    }
    
 
