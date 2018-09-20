public class FundamentalTwo
{
    public static void main(String args[]) 
    {
        int[] arrayInt = {1,2,3,4,5};
        double[] arrayDoub = {1.0,2.0,3.0,4.0,5.0};
        String[] arrayStr = {"one","two","three","four","five"};
        System.out.format("first integer is: %d\nthird double is: %g\nfifth string is: %s", arrayInt[0], arrayDoub[2], arrayStr[4]);
    }

    public static void printArray(int arrayInt[], boolean skip)
    {
        if (skip == true)
        {
            for (int place = 0; place < arrayInt.length; place += 2)
            {
                System.out.format("%d\n",arrayInt[place]);
            }
        }
        else 
            for (int place = 0; place < arrayInt.length; place++)
            {
                System.out.format("%d\n",arrayInt[place]);
            }
    }

    public static void printArray(Double arrayDou[], boolean skip)
    {
        if (skip == true)
        {
            for (int place = 0; place < arrayDou.length; place += 2)
            {
                System.out.format("%g\n",arrayDou[place]);
            }
        }
        else 
            for (int place = 0; place < arrayDou.length; place++)
            {
                System.out.format("%g\n",arrayDou[place]);
            }
    }

    public static void printArray(String arrayStr[], boolean skip)
    {
        if (skip == true)
        {
            for (int place = 0; place < arrayStr.length; place += 2)
            {
                System.out.format("%s\n",arrayStr[place]);
            }
        }
        else 
            for (int place = 0; place < arrayStr.length; place++)
            {
                System.out.format("%s\n",arrayStr[place]);
            }
    }

}