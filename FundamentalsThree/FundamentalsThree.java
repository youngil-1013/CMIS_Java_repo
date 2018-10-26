
public class FundamentalsThree
{
    public static void main(String[] args)
    {
        int [][] defaultIntArray = new int [5][5];
        int [][] literalIntArray = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
        double [][] defaultDoubleArray = new double [5][5];
        double [][] literalDoubleArray = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
    }

    public static int returnValue (int [][] intArray, int y, int x)
    {
        return intArray [y][x];
    }

    public static double returnValue (double [][] doubleArray, int y, int x)
    {
        return doubleArray [y][x];
    }

    public static String returnValue (String [][] StringArray, int y, int x)
    {
        return StringArray [y][x];
    }

    public static void setValue (int[][] arr, int y, int x, int v)
    {
        arr [y][x] = v;
    }

    public static void setValue (double[][] arr, int y, int x, double v)
    {
        arr [y][x] = v;
    }

    public static void setValue (String[][] arr, int y, int x, String v)
    {
        arr [y][x] = v;
    }

    public static void print2DArray(int[][] array, boolean rowMajor)
    {
        if (rowMajor == true)
        {
            for (int y = 0; y < array.length; y ++)
            {     
                for (int x = 0; x < array[y].length; x ++)
                {
                    System.out.print(array[y][x] + " ");
                }
                System.out.println("");
            }
        }
        else
        {
            for (int y = 0; y < array.length; y ++)
            {     
                for (int x = 0; x < array[y].length; x ++)
                {
                    System.out.print(array[x][y] + " ");
                }
                System.out.println("");
            }
        }
    } // end of 5

    public static void snakePrint(int[][] arr)
    {
        for (int y = 0; y < arr.length; y ++)
        {
            if (y % 2 == 0)
            {
                for (int x = 0; x < arr[y].length; x ++)
                {
                    System.out.print(arr[y][x] + " ");
                }
            }
            else
            {
                for (int x = arr[y].length - 1; x >= 0 ; x --)
                {
                    System.out.print(arr[y][x] + " ");
                }
            }
        }
        System.out.println("");
    } // end of 6

    public static String[][] locate(String[][] arr)
    {
        int randInt = (int)(Math.random() * 9);
        int randX = (int)(Math.random() * arr.length);
        int randY = (int)(Math.random() * arr[0].length);
        String [][] result = new String [arr.length][arr[0].length];
        for (int y = 0; y < arr.length; y ++)
        {
            for (int x = 0; x < arr[y].length ; x ++)
            {
                if (x == randX && y == randY)
                    result [x][y] = String.format("%d",randInt);
                else
                    result [x][y] = "#";
            }
        }
        return result;
    } // end of 7
    
    public static int[][] replace(int[][] array, int threshold, int newValue)
    {
        int [][] result = new int [array.length][array[0].length];
        for (int y = 0; y < array.length; y ++)
        {
            for (int x = 0; x < array[y].length; x ++)
            {
                if (array [y][x] <= threshold)
                result [y][x] = array [y][x];
                else 
                result [y][x] = newValue;
            }
        }
        return result;
    } // end of 8
    
    public static double[][] shift(double[][] arr, int row)
    {
        return null;
    }
}
