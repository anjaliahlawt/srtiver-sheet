//Count Maximum Consecutive One’s in the array

package ARRAYEASY;
public class a18
{
    public static void main(String[] args) 
    {
        int[]arr={1,1,1,1,0,1};
        int n=arr.length;
       int count=0;int max1=0;
        for(int i=0;i<n;i++)
        {  
            if(arr[i]==1)
            {
                count++;
            }
            else
            {
              count=0;
            }
            max1=Math.max(max1,count);
        }
        System.out.println(max1);
    }
        
}





