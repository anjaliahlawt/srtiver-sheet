//Sort an array of 0s, 1s and 2s

//method 1:
//package ARRAYMEDIUM;
import java.util.*;
public class ar2 
{
    public static void main(String[] args)
    {
        int []arr={2,0,1};
        int n =arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {    int temp;
                if(arr[i]>arr[j])
                {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
           
            
        }
       System.out.println(Arrays.toString(arr));
    }
}
