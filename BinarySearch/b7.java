//Count Occurrences in Sorted Array
public class b7 
{
    public static void main(String[] args)
     {
        int[]arr={1,3,3,3,4,4};
        int n =arr.length;
        int target=4;
        int count=0;
        for(int i=0;i<n;i++)
        {
            
            if(arr[i]==target)
            {
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
