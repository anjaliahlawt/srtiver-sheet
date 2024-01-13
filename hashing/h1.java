//Count frequency of each element in the array

//method 1:
/* 
public class h1 
{
    public static void main(String[] args) 
    {
       int []arr={10,5,10,15,10,5};
       int n=arr.length;
       countfrequency(arr,n);
    }
    static void countfrequency(int[]arr,int n)
    {
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(visited[i]==true)
             continue;
             int count=1;
             for( int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);
        }
       
    }
}
*/
import java .util.*;
public class h1
{
    public static void main(String[] args) 
    {
        int[]arr={10,5,10,15,10};
        int n=arr.length;
        findfrequency(arr,n);
    }
    static void findfrequency(int[]arr,int n)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}