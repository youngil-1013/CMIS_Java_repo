public class FundamentalTwo
{
    public static void main(String args[]) 
    {
        int[] arrayInt = {1,2,3,4,5};
        double[] arrayDoub = {1.0,2.0,3.0,4.0,5.0};
        String[] arrayStr = {"one","two","three","four","five"};
        System.out.format("first integer is: %d\nthird double is: %g\nfifth string is: %s", arrayInt[0], arrayDoub[2], arrayStr[4]);
    }

    public static void printArray(int[] arrayInt, boolean skip)
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

    public static void printArray(double[] arrayDou, boolean skip)
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

    public static void printArray(String[] arrayStr, boolean skip)
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

    public static void printArray(boolean[] arrayBool, boolean skip)
    {
        if (skip == true)
        {
            for (int place = 0; place < arrayBool.length; place += 2)
            {
                System.out.format("%b\n",arrayBool[place]);
            }
        }
        else 
            for (int place = 0; place < arrayBool.length; place++)
            {
                System.out.format("%b\n",arrayBool[place]);
            }
    }

    public static int lastItem(int array[])
    {
        return (array[array.length - 1]);
    }

    public static double lastItem(double array[])
    {
        return (array[array.length - 1]);
    }

    public static String lastItem(String array[])
    {
        return (array[array.length - 1]);
    }

    public static boolean lastItem(boolean array[])
    {
        return (array[array.length - 1]);
    }

    public static int middleItem(int array[])
    {
        return (array[(int)((array.length - 1) / 2)]);
    }

    public static double middleItem(double array[])
    {
        return (array[(int)((array.length - 1) / 2)]);
    }

    public static String middleItem(String array[])
    {
        return (array[(int)((array.length - 1) / 2)]);
    }

    public static boolean middleItem(boolean array[])
    {
        return (array[(int)((array.length - 1) / 2)]);
    }

    public static int[] randomInts(int n, int min, int max)
    {
        int[] result = new int[n];
        for (int length = 0; length < n; length++)
            result[length] = (int) (Math.random() * (max - min + 1) + min);
        return result;
    }

    public static double[] randomDoubles(int n, double min, double max)
    {
        double[] result = new double[n];
        for (int length = 0; length < n; length++)
        {
            result[length] = (Math.random() * (max - min) + min);
        }
        return result;
    }

    public static int[] copy(int[] array)
    {
        int[] copied = new int[array.length];
        for (int length = 0; length < array.length; length++)
        {
            copied[length] = array[length];
        }
        return copied;
    }

    public static boolean[] copy(boolean[] array)
    {
        boolean[] copied = new boolean[array.length];
        for (int length = 0; length < array.length; length++)
        {
            copied[length] = array[length];
        }
        return copied;
    }

    public static String[] copy(String[] array)
    {
        String[] copied = new String[array.length];
        for (int length = 0; length < array.length; length++)
        {
            copied[length] = array[length];
        }
        return copied;
    }

    public static double[] copy(double[] array)
    {
        double[] copied = new double[array.length];
        for (int length = 0; length < array.length; length++)
        {
            copied[length] = array[length];
        }
        return copied;
    }

    public static int[] pairs(int n)
    {
        int[] pairs = new int[n * 2];
        int position = 1;
        for (int length = 0; length < pairs.length; length += 2)
        {
            pairs[length] = (position) * 2;
            pairs[length + 1] = (position) * 2;
            position ++;
        }
        return pairs;
    }

    public static int[] concat(int[] a, int[] b)
    {
        int[] result = new int[a.length + b.length];
        for (int length = 0; length < a.length; length++)
        {
            result[length] = a[length];
        }
        for (int length = a.length; length < a.length + b.length; length++)
        {
            result[length] = b[length - a.length];
        }
        return result;
    }

    public static int[] merge(int[] a, int[] b)
    {
        int place = 0;
        int aPlace = 0;
        int bPlace = 0;
        int resultLength = a.length + b.length;
        int[] result = new int[resultLength];
        if (a.length > b.length)
        {
            for (int aPosit = 0; aPosit < resultLength; aPosit ++)
            {
                result[aPosit * 2] = a[aPlace];
                aPlace ++;
            }
            for (int bPosit = 0; bPosit < b.length * 2; bPosit ++)
            {
                result[(bPosit * 2) + 1] = b[bPlace];
                bPlace ++;
            }
        }
        else
        {
            for (int aPosit = 0; aPosit < a.length * 2; aPosit ++)
            {
                result[aPosit * 2] = a[aPlace];
                aPlace ++;
            }
            for (int bPosit = 0; bPosit < resultLength; bPosit ++)
            {
                result[(bPosit * 2) + 1] = b[bPlace];
                bPlace ++;
            }
        }
        return result;
    }

    public static void reverse(int[] array)
    {
        for(int posit = 0; posit < (array.length / 2); posit ++)
        {
            int left = array[array.length - (posit + 1)];
            array[array.length - (posit + 1)] = array[posit];
            array[posit] = left;
        }
        printArray(array,false);
    }

    public static int[] subArray(int[] array, int start, int stop)
    {
        int [] result = new int [stop - (start - 1)];
        int positArray = 0;
        for (int posit = start; posit <= stop; posit ++)
        {
            result [positArray] = array [posit];
            positArray += 1;
        }
        return result;
    }
    // 13
    public static int[] compareArrays (int[] a, int[] b)
    {
        int scoreA = 0;
        int scoreB = 0;
        int compareLength = 0;
        int newA [];
        int newB [];
        if (a.length == b.length)
        {
            compareLength = a.length;
            newA = a;
            newB = b;
        }
        else if (a.length > b.length)
        {
            compareLength = a.length;
            newB = new int [compareLength];
            for (int length = 0; length < b.length; length ++)
            {
                newB [length] = b [length];
            }
            newA = a;
        }
        else
        {
            compareLength = b.length;
            newA = new int [compareLength];
            for (int length = 0; length < b.length; length ++)
            {
                newA [length] = a [length];
            }
            newB = b;
        }

        for (int posit = 0; posit < compareLength; posit ++)
        {
            if (newA [posit] > newB [posit])
            {
                scoreA ++;
            }   
            else
            {
                scoreB ++;
            }
        }

        if (scoreA > scoreB)
            return a;
        else if (scoreB > scoreA)
            return b;
        else
            return null;
    }
    //14
    public static int[] minimize (int[] array, int threshold)
    {
        int[] result = new int [array.length];
        for (int posit = 0; posit < array.length; posit ++)
        {
            if (array[posit] > threshold)
                result[posit] = threshold;
            else 
                result[posit] = array[posit];
        }
        return result;
    }
    //15
    public static void maximize(int[] array, int threshhold)
    {
        for (int posit = 0; posit < array.length; posit ++)
        {
            if (array[posit] < threshhold)
                array[posit] = threshhold;
            else 
                array[posit] = array[posit];
        }
    }
    //16
    public static double[] maxMerge(double[] a, double[] b)
    {
        int scoreA = 0;
        int scoreB = 0;
        int compareLength = 0;
        double newA [];
        double newB [];
        if (a.length == b.length)
        {
            compareLength = a.length;
            newA = a;
            newB = b;
        }
        else if (a.length > b.length)
        {
            compareLength = a.length;
            newB = new double [compareLength];
            for (int length = 0; length < b.length; length ++)
            {
                newB [length] = b [length];
            }
            newA = a;
        }
        else
        {
            compareLength = b.length;
            newA = new double [compareLength];
            for (int length = 0; length < b.length; length ++)
            {
                newA [length] = a [length];
            }
            newB = b;
        }

        for (int posit = 0; posit < compareLength; posit ++)
        {
            if (newA [posit] > newB [posit])
            {
                scoreA ++;
            }   
            else
            {
                scoreB ++;
            }
        }

        if (scoreA > scoreB)
            return a;
        else if (scoreB > scoreA)
            return b;
        else
            return null;
    }
}