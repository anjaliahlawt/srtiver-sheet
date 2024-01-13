//Union of Two Sorted Arrays
// method 1:using set method
/* 
import java.util.*;
public class a16
 {
    public static void main(String[] args) 
    {
        int []arr1={1,2,3,4,5};
        int []arr2={2,3,4,4,5};
        int n1=arr1.length;
        int n2=arr2.length;
       ArrayList<Integer>Union=FindUnion(arr1,arr2,n1,n2);
       System.out.println("union of arr1 and arr2 is");
       for(int val:Union)
       {
          System.out.print(val+" ");
       }
   }
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n1, int n2)
    {
          HashSet<Integer>s=new HashSet<>();
          ArrayList<Integer> Union=new ArrayList<>();
          for(int i=0;i<n1;i++)
            {
             s.add(arr1[i]);
            }

           for(int i=0;i<n2;i++)
            {
             s.add(arr2[i]);
            }

          for(int it:s)
           {
            Union.add(it);
           }
          return Union;
         }}
    */
    
    //method 2:two pointer
    package ARRAYEASY;
    public class a16
    {
       public static void main(String[] args) 
       {
         int []arr1={1,3,5,7};
         int []arr2={2,4,6,8};
         int n1=arr1.length-1;
         int n2=arr2.length-1;
         System.out.print("the union of two array is:");
         union(arr1,arr2,n1,n2);
       }

       static void union(int[]arr1,int[]arr2,int n1,int n2)
       {  int i=0,j=0;
          while(i<n1&&j<n2)
          {
             if(arr1[i]<arr2[j])
             {
                 System.out.print(arr1[i]);
                 i++;
             }
             else if(arr1[i]>arr2[j])
             {
                System.out.print(arr2[j]);
                j++;
             }
             else
             {
               System.out.print(arr1[i]);
               i++;
               j++;
             }
          }
          while(i<n1)
          {
            System.out.print(arr1[i]);
            i++;
          }
          while(j<n2)
          {
              System.out.print(arr2[j]);
              j++;
          }
       }
    }
