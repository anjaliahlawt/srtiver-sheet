
//linear search
package ARRAYEASY;
public class a15 
{
    public static void main(String[] args) 
    {
        int []arr={1,2,3,4,5};
        int n=arr.length;
        int target=1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                System.out.println(i);
            }
        }
    }
}
