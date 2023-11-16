//package RECURSION;

public class rec7 
{public static void main(String[] args) {
    

    int[]arr={1,2,3,4,6};
    int n=arr.length-1;
    reverse(arr,n);
   
}
static void reverse(int []arr,int n)
{
    int j;
      for(j=n;j>=0;j--)
    if(j<0)
    {
        return ;
    }
System.out.print(arr[j]+" ");
   
   reverse(arr,n);
}
}