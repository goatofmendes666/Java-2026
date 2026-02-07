import org.w3c.dom.css.Counter;

import java.util.Scanner;

public class Loops
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();

        for (int counter = 0; counter <= end; counter += 1)
        {
            System.out.println(counter);
            System.out.println("Hello world");
        }
    }
}
