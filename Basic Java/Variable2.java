public class Variable2
{
    public static void main (String [] args)
    {
        // We can also print variables with other variables.
       int x = 9;
       System.out.println(x + 3);

       // We can also use "var" if we don't have to write the data type everytime.
        // The "var" takes the input and automatically assign the datatype.

        var v = 91;  // now I can't change the value of "var v"
        System.out.println(v);

    }
}
