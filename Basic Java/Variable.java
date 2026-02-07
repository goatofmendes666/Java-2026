public class Variable
{
    public static void main (String[] args)
    {
        // There are 6 types of variables. Boolean, char, int, double, float, string.
        String g = "Garv";
        Boolean a = true;
        char b = 'e';
        int c = 25;
        double f = 5.6;
        float d = 5.6f;
        String e = "Fucked up";

        System.out.println(g);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(e);

        // We can also declare a variable without assigning the value, and assign the value later:
        int myint;
        myint = 15;
        System.out.println(myint);

        // we can also change the value of the variables
        myint = 25;
        System.out.println(myint);

        /* If you don't want others (or yourself) to overwrite existing values, use the final keyword
        (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
         */

        final int fint = 60;
        System.out.println(fint);

       /* fint = 29;
        System.out.println(fint);
    */
    }
}
