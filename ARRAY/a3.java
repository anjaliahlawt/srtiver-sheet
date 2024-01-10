//Find Second Smallest and Second Largest Element in an array
//package ARRAY;

public class a3 
  {
    public static void main(String[] args) 
     {
       int a[]={1,2,4,7,7,5};
       int n=a.length;
       int min1=a[0];
       int min2=10;
       int max1=0;
       int max2=0;
       int temp1;
       int temp2;
       for(int i=0;i<n;i++)
       {
         if(a[i]>max1)
         {
            temp1=max1;
            max1=a[i];
            max2=temp1;
         }
         else if(a[i]>max2&&a[i]!=max1) 
         {
            max2=a[i];
         } 
      } 
       System.out.println("second largest element is:"+max2);
         for(int j=0;j<n;j++)
         {
              if(a[j]<min1)
              {
                 temp2=min1;
                  min1=a[j];
                  min2=temp2;
               }
              else if(a[j]<min2&&a[j]!=min1) 
              {
                   min2=a[j];
              } 
     
         }
    
       System.out.println("second smallest element is:"+min2);
     
      }
   }
    
/* 

    public static void main(String[] args) 
    {
        int []arr={2,4,1,6};
        int n=arr.length;
        int min1=arr[0];
        int min2=10;
        int max1=arr[0];
        int max2=-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[j]>max1)
            {    
                max2=max1;
                max1=arr[j];
            }
            else if(arr[j]>max2&&arr[j]!=max1) 
            {
                 max2=arr[j];
            } 
            if(arr[i]<min1)
            { 
                min2=min1;
                min1=arr[i]; 
             }
            else if(arr[i]<min2&&arr[i]!=min1) 
            {
                 min2=arr[i];
            } 
         
        }}
        System.out.println("second smallest"+min2);
        System.out.println("second largest"+max2);
    }
}
*/