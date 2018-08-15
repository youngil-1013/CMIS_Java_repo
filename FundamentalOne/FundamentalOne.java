public class FundamentalOne
{
    public static void main (String args [])
    {
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
    
} // end class FundamentalOne