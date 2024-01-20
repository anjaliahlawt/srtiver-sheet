//Leaders in an Array
public class ar7 
{
    public static void main(String[] args) 
    {
        int arr[]={4,7,0,3,6};
        int n=arr.length;
       
        for(int i=0;i<n;i++){
          int j;
       for(j=i+1;j<n;j++)
       {
         if(arr[i]<=arr[j])
         
          break;
         }
         if(j==n)
         
          System.out.println(arr[i]);
         
      
       }
    

    }
}
