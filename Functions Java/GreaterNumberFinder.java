package Functions;
import java.util.Scanner;

public class GreaterNumberFinder {
    public static int calculateGreater(int a, int b){
        if (a > b)
            return 0;

        else if (a < b)
            return 1;

        else
            return 2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b = sc.nextInt();

        int greater = calculateGreater(a, b);
        if(greater == 0)
            System.out.println(a + " is greater than " + b);
        if (greater == 1)
            System.out.println(b + " is greater than " + a);
        if (greater == 2)
            System.out.println("Both are equal");
    }
}
