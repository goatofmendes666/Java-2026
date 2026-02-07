public class Typecast
{
    public static void main (String [] args)
    {
        // Widening Casting or Automatic Casting
        int i = 97;
        double d = i;
        System.out.println(d);

        // Narrowing Casting or Manual Casting
        double d1 = 96.7d;
        int i1 = (int) d1;
        System.out.println(i1);
    }
}
