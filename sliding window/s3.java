//first negative number in every window of size k
import java.util.*;

public class s3 
{
    public static void main(String[]args)
    {
      int []arr={12,-1,-7,-8,-15,30,16,28};
      int n =arr.length;
      int k=3;
      int[] result = first(arr, n, k);
      System.out.println(Arrays.toString(result));


    }
    static int[] first(int[]arr,int n,int k)
    {
      List<Integer>Negative=new ArrayList<>();
      {
        for(int i=0;i<k;i++)
        {
            if(arr[i]<0)
            {
                Negative.add(arr[i]);
            }
        }
        if(!Negative.isEmpty())
        {
            System.out.println(Negative.get(0)+"");
        }
        else 
        {
            System.out.println("0");
        }
        for(int j=k;j<n;j++)
        {
            if(!Negative.isEmpty()&& arr[j-k]==Negative.get(0))
            {
                Negative.remove(0);
            }
            if(arr[j]<0)
            {
                Negative.add(arr[j]);
            }
            if(!Negative.isEmpty())
            {
                System.out.println(Negative.get(0));
            }
            else
            {
                System.out.println("0");
            }
        }
      }
      int[] resultArray = new int[n - k + 1];
      for (int i = 0; i < resultArray.length; i++) {
          resultArray[i] = Negative.isEmpty() ? 0 : Negative.get(0);
          if (!Negative.isEmpty() && arr[i] == Negative.get(0)) {
              Negative.remove(0);
          }
          if (i + k < n && arr[i + k] < 0) {
              Negative.add(arr[i + k]);
          }
      }
      return resultArray;
    }
}
