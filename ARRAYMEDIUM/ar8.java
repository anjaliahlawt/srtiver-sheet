//rotate matrix by 90 degrree

import java.util.Scanner;

public class ar8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int[][] arr1 = new int[n][n];
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr1[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                ans[j][n - 1 - i] = arr1[i][j];
            }
        }

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println(); 
    }
}

}