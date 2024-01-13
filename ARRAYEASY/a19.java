//Find the number that appears once, and the other numbers twice

//method 1:
package ARRAYEASY;
/* 
public class a19
 {
    public static void main(String[] args) 
    {
        int []arr={4,1,2,1,2};
        int n=arr.length;
        int result=findminnumber(arr,n);
        System.out.println(result);
    }
        
      static int findminnumber(int []arr,int n){
        for(int i=0;i<n;i++)
         {
            int count =0;int num=arr[i]; 
            for(int j=0;j<n;j++)
            {
               if(arr[j]==num)
              {
                count++;
              }
              if(count==1)
              {
                return num;
              }
        }

    }
    return -1;
}
 }
 */


 //method 2:using xor
 //XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
//XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  ←Property 2

public class a19
{
    public static void main(String[] args) 
    {
        int []arr={2,2,1};
        int n=arr.length;
        int result=find(arr,n);
        System.out.println(result);

    }
    static int find(int[]arr,int n)
    {

        int xorr=0;
        for(int i=0;i<n;i++)
        {
            xorr=xorr ^ arr[i];
        }
        return xorr;
     
    }
    
}