import java.util.Scanner;

public class SumofNaturalNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;

        for (int i = 1; i<=n; i++)
        {
            temp += i;
        }
        int sum = temp;
        System.out.println("The sum of all the natural numbers upto " + n + " is " + sum);
    }
}
