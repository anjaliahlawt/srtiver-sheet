//Search Element in Rotated Sorted Array II
/* 
public class b9
 {
     public static void main(String[] args) 
     {
        int[]arr={6,7,8,9,1,2,3,4};
        int n =arr.length;
        int target=2;
        boolean ans=search(arr,n ,target);
        System.out.println(ans);
        
     }
     static boolean search(int[]arr,int n ,int target)
     {
        int ans=-1;
        for(int i =0;i<n;i++)
        {
            if(arr[i]==target)
            {
                return true;
            }
        }
        return false;
     }
}
*/

class b9
{
    public static void main(String[] args)
    {
       int []arr={8,9,10,1,2,3,4};
       int n =arr.length;
       int target=2; 
       boolean ans=search(arr,n,target);
       System.out.println(ans);
    }
    static boolean search(int[]arr,int n ,int target)
    {
        int start=0,end=n-1;
        int ans=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target)
            {
                return true;

            }
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) 
            {
                start = start + 1;
                end = end - 1;
                continue;
            }
            if(arr[start]<=arr[mid])
            {
              if(arr[start]<=target&&target<=arr[mid])
              {
                end=mid-1;
              }
              else
              {
                start=mid+1;
              }
            }
            else
            {
              if(arr[mid]<=target&&target<=arr[end])
              {
                start=mid+1;
              }
              else
              {
                end=mid-1;
              }
            }
        }
        return false;
    }
}


