//Remove Duplicates in-place from Sorted Array
public class a5
{
    public static void main(String[] args) 
    {
        int [] a={1,1,1,2,2,3,3,4,4};
        int result=search(a);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < result; i++)
        {
            System.out.println(a);
        }
          
    }
        public static int search(int[] a)
        {
            int length=a.length;
            int i=0;
            for(int j=1;j<length;j++)
            {
                if(a[i]!=a[j])
                {
                  
                    a[i+1]=a[j];
                    i++;
                 
                }
               
            }
            return i+1;
       }
}