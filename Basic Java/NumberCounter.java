import java.util.Scanner;

public class NumberCounter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();

        for (int i = 0; i <= counter; i++ )
        {
            System.out.println(i);
        }
    }
}
