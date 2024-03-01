//Let’s say the given array is = {3, 4, 6, 7, 9, 12, 16, 17} and target = 6.

package BinarySearch;

public class b1 
{
    public static void main(String[] args) 
    {
        int[]arr={3,4,6,7,9,12,16,17};
        int target=6;
        int n =arr.length;
        int ans=Search(arr,target);
        if(ans==-1)
        {
            System.out.println("the target is present"+ans);
        }
        else
        {
            System.out.println("the index is present"+ans);
        }
        
       
        
    }
    static int Search(int[]arr,int target)
    {  
        int n =arr.length;
        int start=0,end=n-1;
        while(start<=end){
        int mid=(start+end)/2;
        if(arr[mid]==target)
        return mid;
        
      else  if(target>arr[mid])
      start=mid+1;
      else
      {
         end=mid-1;
      }
    }
  return -1;  
}

}
