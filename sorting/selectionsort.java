
//selsction sort

//package sorting;
public class selectionsort
{
    public static void main(String[] args) 
    {
        int []arr={13,46,24,52,20,9};
        int n =arr.length;
        System.out.println("before  selection sorting");
        for(int k=0;k<n;k++)
        {
            System.out.print(arr[k]+" ");
        }
       System.out.println();
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j =i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
     System.out.println("after selction sorting");
     for(int k=0;k<n;k++)
     {
        System.out.print(arr[k]+" ");
     }
     System.out.println();
    }
}
