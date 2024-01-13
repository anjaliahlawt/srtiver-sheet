public class h2 
{
    public static void main(String[] args)
    {
        int []arr={10,5,10,15,10,5};
        int n=arr.length;
        findoccurency(arr,n);
    }
    static void findoccurency(int[]arr,int n)
    {
        boolean visited[]=new boolean[n];
        int maxele=0;int maxfre=0;
        int minele=0;int minfre=n;
        for(int i=0;i<n;i++)
        {   
            if(visited[i]==true)
            continue;
            int count=1;
            for(int j=i+1;j<n;j++)
            {   
                if(arr[i]==arr[j])
                {
                  visited[j]=true;
                  count++;
                }
            }
            if(count>maxfre)
            {
                maxele=arr[i];
                maxfre=count;
            }
            if(count<minfre)
            {
                minele=arr[i];
                minfre=count;
            }
           
        }
        System.out.println("the highest frequency is"+maxele);
        System.out.println("the  minimum freq is:"+minele);

    }
}
