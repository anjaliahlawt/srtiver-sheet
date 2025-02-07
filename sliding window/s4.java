//find frequency (x)in every window size of k
public class s4
 {
    public static void main(String[] args)
    {
        int [] arr={2,2,1,2,4,6,2};
        int n =arr.length;
        int k=3;
        int x=2;
        int count=0;
        for(int i=0;i<k;i++)
        {
            if(arr[i]==x)
            {
                count++;
            }
        }
        System.out.println(count);
        for(int j=k;j<n;j++)
        {
            if(arr[j]==x)
            {
                count++;
             

            }
            if(arr[j-k]==x)
            {
                count--;
            }
            System.out.println(count);
        }
        
    }
}
