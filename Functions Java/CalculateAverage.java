package Functions;
import java.util.Scanner;
class CalculateAverage {
    public static int calculateAverage(int a,int b, int c){
        int sum = a + b + c;
        int num = 3;
        int avg = sum / num;
        return avg;
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to calculate Average.");

        System.out.print("enter the first number: ");
        int a = sc.nextInt();

        System.out.print("enter the second number: ");
        int b = sc.nextInt();

        System.out.print("enter the third number: ");
        int c = sc.nextInt();

        int average = calculateAverage(a, b, c);
        System.out.println(average);
    }
}