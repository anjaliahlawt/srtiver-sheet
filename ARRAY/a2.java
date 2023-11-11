//Find Smallest and  Largest Element in an array
//package ARRAY;
public class a2 
{
    public static void main(String[] args)
    {
        int a[]={1,2,4,7,7,5};
        int n=a.length;
        int min=a[0];
        int max=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
            if(a[i]>max)
            {   
                max=a[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
