//Two Sum : Check if a pair with given sum exists in Array

//method 1:
package ARRAYMEDIUM;
/* 

public class ar1
{
   public static void main(String[] args)
   {
      int[]arr={2,6,5,8,11};
      int target=14;
      int n=arr.length;
     String ans= sum(arr,n,target);
     System.out.println(ans);
   }
       static String sum(int[]arr,int n,int target)
       {
            int sum;
            for(int i=0;i<n;i++)
            {
               for(int j=1;j<n;j++)
               {
                  sum=arr[i]+arr[j];
                  if(sum==target)
                    {
                      System.out.println(i+" "+j);
                      return "yes";
                    }
                    
                }
            }
            return "no";
        } 
    }
*/

//method 2:using hashmap
import java.util.*;
public class ar1
{
    public static void main(String[] args)
    {
       int arr[]={2,6,5,8,11};
       int target=13;
       int n =arr.length; 
       String ans=sum(arr,n,target);
       System.out.println(ans);
    }

    static String sum(int []arr,int n,int target)
    {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<n;i++)
       {
         int num=arr[i];
         int moreno=target-num;
         if(map.containsKey(moreno))
         {System.out.println(map);
            return "yes";
           
         }
         map.put(arr[i],i);
       }
       return "no";

    }
}