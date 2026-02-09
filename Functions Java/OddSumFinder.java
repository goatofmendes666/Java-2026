package Functions;
import java.util.Scanner;
public class OddSumFinder {

    public static int calculateOddSum(int n){
        if(n <= 0)
            return 0;

        int sum = 0;
        for (int i = 1; i <= n; i++){
            if (i % 2 != 0)
            {
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find sum of all odd numbers: ");
        int n = sc.nextInt();

        int sum = calculateOddSum(n);
        System.out.println(sum);
    }
}
