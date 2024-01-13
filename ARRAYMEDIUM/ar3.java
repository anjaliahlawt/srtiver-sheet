//Find the Majority Element that occurs more than N/2 times

//method 1:
package ARRAYMEDIUM;
public class ar3 
{
    public static void main(String[] args)
    {
        int []arr={4,4,2,4,3,4,4,3,2,4};
        int n=3;
        int target=n/2;
       
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                   count++;
                }
              
            }
             if(target==count)
            {
                System.out.println(arr[i]);
             }
        
    }}
}
