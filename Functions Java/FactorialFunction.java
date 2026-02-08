import java.util.Scanner;

public class FactorialFunction {
    public static void calculateFactorial(int n){
        int factorial = 1;
        if (n < 0)
        {
            System.out.println("Factorial is not defined for negative numbers");
            return;
        } else if (n == 1 || n == 0) {
            System.out.println("Factorial of " + n + " is 1");
            return;
        }

        for (int i = n; i >= 1; i--)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + n + " is " + factorial);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print the factorial : ");
        int n = sc.nextInt();

        calculateFactorial(n);
    }
}
