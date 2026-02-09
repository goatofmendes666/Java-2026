package Functions;
import java.util.Scanner;
public class FindingPrime {
    public static void calculatePrime(int n)
    {
        if (n <= 1)
        {
            System.out.println("Cannot calculate prime of " + n);
            return;
        }

        for (int i = 2; i * i <= n; i++)
        {
            if(n % i == 0)
            {
                System.out.println("It's not prime!");
                return;
            }
        }
        System.out.println("It's Prime!");
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate the prime: ");
        int n = sc.nextInt();

        calculatePrime(n);
    }
}
