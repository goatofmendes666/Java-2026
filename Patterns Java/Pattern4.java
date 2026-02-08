import java.util.Scanner;

public class Pattern4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++)
         {
             for (int j = 1; j <= n-i+1; j++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }

        // or we can do this.

        for (int a = n; a >= 1; a--)
        {
            for (int b = 1; b <= a; b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
