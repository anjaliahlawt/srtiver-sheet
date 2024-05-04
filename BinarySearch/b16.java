//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
import java.util.*;
class b16
{
    public static void main(String[] args) 
    {
        int []arr={5,7,7,8,8,10};
        int target=8; 
        int n =arr.length;
        int first=firstsearch(arr, target,n);
        int last=lastsearch(arr, target, n);
        int []Array= new int[]{first,last};
        System.out.print(Arrays.toString(Array));
        
        
    }
    static int firstsearch(int[]arr,int target,int n)
    {
        int start=0;int end=n-1;
        int ans=-1;
        while(start<=end)
        {   
            int mid=(start+end)/2;
           
            if(arr[mid]==target)
            {
                ans=mid;
                end=mid-1;
                
            }
            else if(arr[mid]>target)
            {
              end=mid-1;
            }
            else
            {
                start=mid+1;
            }
            
            
        
    }
    return ans;
    }
    static int lastsearch(int[]arr,int target,int n)
    {
        int start=0;int end=n-1;
        int ans=-1;
        while(start<=end)
        {   
            int mid=(start+end)/2;
           
            if(arr[mid]==target)
            {
                ans=mid;
                start=mid+1;
                
            }
            else if(arr[mid]>target)
            {
              end=mid-1;
            }
            else
            {
                start=mid+1;
            }
            
            
        
    }
    return ans;
    }
}


