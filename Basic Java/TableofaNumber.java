import java.util.Scanner;

public class TableofaNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to print the table - ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The table of " + n + " is -");

        for (int i = 1; i <= 10; i++) {
            int product = n * i;
            System.out.println(n + " x " + i + " = " + product);
        }
    }
}
