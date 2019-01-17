public class RecursionEx
{
    public static void main (String[] args)
    {
        System.out.println(multiply(10, 0));
        System.out.println(multiply(0, 10));
        System.out.println(multiply(10, 10));
        System.out.println(multiply(-10, 0));
        System.out.println(multiply(0, -10));
        System.out.println(multiply(-10, -10));
        System.out.println(multiply(-10, -1));
        System.out.println(multiply(-10, 5));
        System.out.println(multiply(5, -10));
    }

    public static int multiply (int a, int b)
    {
        if (b == 0 || a == 0) 
        {
            return 0;
        }
        else if (b == 1)
        {
            return a;
        }
        else if (a == 1)
        {
            return b;
        }
        else if (b >= 0) // (+, +), (-, +)
        { 
            return (a + multiply (a, b - 1));        
        }
        else if (a < 0 && b > 0) // (-, +)
        {
            return (b + multiply (a - 1, b));
        }
        else // (-,-)
        {
            return -a + multiply (a, b + 1);
        }
    }

    public static int div (int a, int b)
    {
        if (Math.abs(a) < Math.abs(b))
        {
            return 0;
        }
        else 
        {
            return (1 + div (a - b, b));
        }
    }

    public static int sqr (int a, int b)
    {
        if (b == 0)
        {
            return 1;
        }
        else
        {
            return (multiply (a, sqr(a, b - 1)));
        }
    }
}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */