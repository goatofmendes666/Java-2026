import java.util.Scanner;

public class Adultfinder
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.print("Your age is " + age + " and ");

        if (age > 18)
        {
            System.out.println("You are an Adult.");
        }
        else
        {
            System.out.println("You are still a kid buddy.");
        }

    }
}
