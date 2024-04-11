
//Find out how many times the array has been rotated

/* 
public class b11 
{
    public static void main(String[] args)
    {
        int[]arr={4,5,6,7,0,1,2,3};]

        otate(arr,n);
        System.out.println(ans);
        
    }
    static int rotate(int[]arr,int n)
    {
        int ans=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<ans)
            {
                ans=arr[i];
                index=i;
            }
        }
        return index;

    }
    
}
*/
class b11
{
    public static void main(String[] args) onhpppppppppppppppppppp] `a1qqAAAAAAAAAAAAAAAAAAAAAAA9/* */
    {
        int[]arr={3,4,5,0,1,2};
        int n =arr.length;
        int ans=rotate(arr,n);
        System.out.println(ans);
    }
    static int rotate(int[]arr,int n)
    {
        int ans=Integer.MAX_VALUE;
        int start=0;int end=n-1;
        int index=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[start]<=arr[end])
            {
                if(arr[start]<ans)
                {
                    index=start;
                    ans=arr[start];
                    break;
                }
            }
            if(arr[start]<arr[mid])
            {
                if(arr[start]<ans)
                {
                    index=start;
                    ans=arr[start];
                }
                start=mid+1;
            }
            else
            {
                if(arr[mid]<ans)
                {
                    index=mid;
                    ans=arr[mid];

                }
                end=mid-1;
            }
        }
        return index;
    }
}