//Stock Buy And Sell

//method 1:time complexity n2

//package ARRAYMEDIUM;
/* 
public   class ar5
 {
    public static void main(String[] args) 
    {
        int []arr={7,1,5,3,6,4};
        int n =arr.length;
        int ans=maximumprofit(arr,n);
        System.out.println(ans);
    }

     static int maximumprofit(int []arr,int n)
     {
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i])
                {
                    max1=Math.max(arr[j]-arr[i],max1);
                }
            }
        }
        return max1;
     }
}

*/

//method 2.time complexity :n

public class ar5
{
    public static void main(String[] args)
    {
        int[]arr={7,1,5,3,6,4};
        int n =arr.length;
        int ans=maximumprofit(arr,n);
        System.out.println(ans);
    }

    static int maximumprofit(int[]arr,int n )
    {
        int min1=Integer.MAX_VALUE;
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            min1=Math.min(min1,arr[i]);
            max1=Math.max(max1,arr[i]-min1);
        }
        return max1;
    }
}