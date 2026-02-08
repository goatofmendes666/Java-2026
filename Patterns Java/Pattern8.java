import java.util.Scanner;

public class Pattern8
{
    public static void main(String[] args)
    {

        // this is also called Floyed's Triangle

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                t += 1;
                System.out.print(t + " ");
            }
            System.out.println();
        }
    }
}
