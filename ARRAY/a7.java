public class a7 
{
    public static void main(String[] args) 
    {  
        int [] arr={1,2,3,4,5,6,7,8,12,13,14,17,34,35,56};
        int start=0;
        int end=arr.length-1;
        int search=8;
        int result=binarySearch(arr,start,end,search);
        System.out.println(result);
    }
    static int binarySearch(int[] arr,int start,int end,int search){
        if(start<=end){
       int mid=(start+end)/2;
       if(arr[mid]==search){
        return mid;
       }
       else if(arr[mid]>search){
         return binarySearch(arr, start, mid-1, search);
       }
       else if(arr[mid]<search){
         return binarySearch(arr, mid+1, end, search);
       }}

       return -1;
    }

}
