//Nth Root of a Number using Binary Search

public class b15
{
   public static void main(String[] args)
    {
     int n =3;
     int m=27;
     int ans=cube(n,m);
     System.out.println(ans);
    }
    static int cube(int n,int m)
     {
        int ans=1;
        for(int i=1;i<=m;i++)
       {
          if(i*n==m)
          {
            
            return i;
          }
         else
         break;
        }
     
     return -1;
    } 
}
