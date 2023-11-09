 //FIND THE LARGEST ELEMNT IN THE ARRAY

package ARRAY;
public class a1 
  {
    public static void main(String[] args)
      {
       int a[]={2,5,1,3,0};
       int n=a.length;
       int max=0;
       for(int i=0;i<n;i++)
         {
          if(a[i]>max)
          {
            max=a[i];
          }
          
         }
        System.out.println(max);
      }
   }


