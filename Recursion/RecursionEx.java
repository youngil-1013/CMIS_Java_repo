public class RecursionEx
{
    public static void main (String[] args)
    {
        System.out.print(sqr (10, 0));
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
        else 
        {
            return (a + multiply (a, b - 1));
        }
    }

    public static int div (int a, int b)
    {
        if (a < b)
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