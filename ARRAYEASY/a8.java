//revrse an array

import java.util.Arrays;

public class a8 
{
    public static void main(String[] args) 
      {
         int[] arr={1,2,3,4,6};
         ReverseArray(arr);
         System.out.println(Arrays.toString(arr));
      } 
    static void ReverseArray(int [] arr)
   {
      int start=0;
      int end=arr.length-1;
      int temp;
    while(start<end)
      {
         temp=arr[start];
         arr[start]=arr[end];
         arr[end]=temp;
         start++;
         end--;
      }
   }
}
    
