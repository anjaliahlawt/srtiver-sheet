//Check if an Array is Sorted

public class a4 
{
    public static void  main(String[] args) 
    {
    
        int []a={1,2,3,0};
        boolean  result = search(a);
        System.out.println(result);
    }
     public static boolean search(int[] a){
        int n=a.length;
        for(int i=1;i<n;i++)
        {
               if(a[i-1]<=a[i])
               {
                  
               }
               else
               {
                  return false;
               }
        }
        return true;
    }


}



