import java.util.Scanner;
public class FundamentalOne

{
    public static void main (String args [])
    {int A, B, Sum, Diff ;
        A = 7 ;
        B = 4 ;
        Sum = add(A,B) ;
        Diff = subtract(A,B) ;
        System.out.format("%d + %d = %d\n%d - %d = %d", A, B, Sum, A, B, Diff) ;
        Scanner Scan = new Scanner (System.in) ;
        System.out.println("\nType in two numbers you wish to multiply") ;
        int multA = Scan.nextInt() ;
        int multB = Scan.nextInt() ;
        System.out.println("\nType in the numerator of your fraction") ;
        int Numerator = Scan.nextInt() ;
        System.out.println("\nTypes in the denominator of your fraction") ;
        int Denominator = Scan.nextInt() ;
        int multResult = mult(multA,multB) ;
        int divResult = div(Numerator,Denominator) ;
        System.out.format("%d * %d = %d\n%d / %d = %d", multA, multB, multResult, Numerator, Denominator, divResult) ;
        compare(2,4);
        System.out.format("%d",evenOddZero(13));
    } // end method main

    public static void dataTypes ()
    {
        byte B = 127 ;
        short S = 32767 ;
        int I = 237462848 ;
        long L = 3787182587L ;
        float F = 3.14f ;
        double D = 453.5454D ;
        boolean b = false ;
        char C = 'C' ;
        String ExpByte = "Byte is between -128 and 127.\nWe can use them to represent student class numbers, numbers of cookies in a jar, and the number of fingers on a hand" ;
        String ExpShort = "Short is between -32768 and 32767.\nWe can use them to represent the radius of Earth(KM), distance from Earth to Moon(KM), and the amount of sleep I need per day(minutes)" ; 
        String ExpInt = "Integer is between -2^31 and 2^31-1.\nWe can use them to represet the number of Earthlings, about the amount of time I have left on Earth in seconds (68 years), and the number of cells in my toenail";
        String ExpLong = "Long represents BIG BOI numbers. I quit to define its range.\nWe can use them to represent the number of cells in our body, the number of days required to travel to Andromedea Galaxy, and the number of hours I need to sleep until I die";
        String ExpFloat = "Float represents decimals.\nIt can represent GPA's, precise lengths, and the first few decimals of pi.";
        String ExpDouble = "Double represents even longer decimals.\nIt can represent the length of an amoeba, the radius of a cell, and the foot size of an ant";
        String ExpBoolean = "Booleans are either true or false.\nIt can represent whether I got a question right in mathematics, social studies or physics";
        String ExpChar = "Char can express single letters.\nIt can represent letter grades, first names, and difficulty levels";
        // Explanation for each Data Type 
        System.out.format("Examples of data types: %d,%d,%d,%d,%f,%f,%b,%c", B, S, I, L, F, D, b, C);
    } // end method dataTypes

    public static int add(int a, int b) 
    {
        int Result = a + b ;
        return Result ;
    }

    public static int subtract(int a, int b)
    {
        int Result = a - b ;
        return Result ;
    }

    public static int mult(int a, int b)
    {
        int Result = a * b ;
        return Result ;
    }

    public static int div(int numerator, int denominator)
    {
        int Result = numerator/denominator ;
        return Result ;
    }

    public static double Dadd(double a, double b) 
    {
        double Result = a + b ;
        return Result ;
    }

    public static double Dsubtract(double a, double b)
    {
        double Result = a - b ;
        return Result ;
    }

    public static double Dmult(double a, double b)
    {
        double Result = a * b ;
        return Result ;
    }

    public static double Ddiv(double numerator, double denominator)
    {
        double Result = numerator/denominator ;
        return Result ;
    }

    public static void compare(int a, int b)
    {
        if (a > b)
            System.out.format("The value of a is %d and it is greater than b whose value is %d", a, b);
        else if (a < b)
            System.out.format("The value of a is %d and it is less than b whose value is %d", a, b);
        else if (a == b)
            System.out.format("The value of a is %d and it is equal to b whose value is %d", a, b);
    }

    public static int evenOddZero (int Number)
    {
        if (Number == 0)
        {return 0;}
        else if (Number % 2 == 0)
        {return 1;}
        else
        {return -1;}
    }

    public static void squareTable ()
    {
        int initial ;
        for (initial = 1; initial <= 10; initial++)
        {
            int sqr = initial*initial ;
            int rdm = (int)(Math.random()*((sqr-initial)+1))+initial;
            System.out.format("%d\t%d\t%d\n", initial, sqr, rdm) ;
        }
    }

    public static void triangle (int tri)
    {
        int Totalsum = 0 ;
        for (int integer = tri; integer > 0; integer--)
        {
            Totalsum += integer ;
        }
        System.out.print(Totalsum);
    }

    public static void pyramid (int integer)
    {
        int Totalpyr = 0 ;
        while (integer > 0)
        {
            Totalpyr += integer*integer;
            integer--;
        }
         System.out.print(Totalpyr);
    }
}