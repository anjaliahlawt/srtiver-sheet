//Minimum swaps required to bring all elements less than or equal to k together

public class s1
{
  public static void main(String[]args)
  {
     int []arr={2,1,2,1,3,4,2};
     int k=3;
     int x=2; 
     int count=0;
     for(int i=0;i<k;i++)
     {
        if(arr[i]==x)
        {
            count++;
        }
     }
     System.out.println("first window frequency"+""+count);
     for(int j=k;j<arr.length;j++)
     {
        if(arr[j]==x)
        {
            count++;

        }
         else if(arr[j-k]==x)
         {
            count--;
         }
         System.out.println("Count for window ending at index " + j + ": " + count);
     }
     System.out.println("count of final window"+count);
  }
}