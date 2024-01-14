//Move all Zeros to the end of the array
//method 1:
/*import java.util.*;
public class a14 
{
    public static void main(String[] args) 
    {
        int []arr={1,0,2,3,0,4,0,1};
        int n =arr.length;
        nonzero(arr,n);
        System.out.println(Arrays.toString(arr));
        
    }
    static int []nonzero(int []arr1,int n)
    {
           ArrayList<Integer>temp=new ArrayList<>();
           for(int i=0;i<n;i++)
           {
              if(arr1[i]!=0)
              {
                temp.add(arr1[i]);
              }
            }
              int nz=temp.size();
              for(int i=0;i<nz;i++)
              {
                arr1[i]=temp.get(i);
              }
              for(int i=nz;i<n;i++)
              {
                    arr1[i]=0;
              }
             return arr1;


    }
}
*/
//method 2;
//package ARRAYEASY;
import java.util.*;
public class a14
{
   public static void main(String[] args) 
   {
     int []arr={1,0,2,3,0,4,0,1};
     int n=arr.length;
     int j=-1;
     for(int i=0;i<n;i++)
     {
        if(arr[i]==0)
        {
           j=i;
           break;
        }
     }
     for(int i=j+1;i<n;i++)
     {
        if(arr[i]!=0)
        {
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           j++;
        }
     }
     System.out.println(Arrays.toString(arr));
   }
}