public class FundamentalsIIIQuiz{
    public static void main(String[] args){
        int[][] array1 = {{606, -11778, 14724, 19623},
                {-9474, 12334, 2791, -13518},
                {-13681, -8397, -6940, -726},
                {-2978, 7212, 2201, 6735}};

        int[][] array2 = {{-11882, -4377, 5226, -664, -1108, 7142, 2017},
                {7071, -8942, -13904, -17035, -2606, -11831, -13766},
                {-12234, -9534, -15779, 13615, 10270, -6859, 6361},
                {-6033, -549, -15958, 17019, -9666, -4876, -6368}};

        int[][] array3 = {{-5487, -18628, 3365, -14728, 10979},
                {-11403, 13387, -10335, -10113, -12000},
                {-10585, -18889, 15515, -16093, -6097},
                {-17722, 9392, -13208, -17901, -6223},
                {-14081, -10776, -6435, -13976, 2823},
                {-13029, -8753, -5213, -3666, 13910},
                {16639, -11206, -14375, 8119, -9044},
                {7253, -11243, -9436, -14244, -15883}};
    }

    /*
     * allGreater should return true if every value in array is strictly greater than threshold
     */
    public static boolean allGreater(int[][] array, int threshold)
    {
        boolean result = true;
        for (int y = 0; y < array.length; y ++)
        {
            for (int x = 0; x < array[0].length; x ++)
            {
                if (array[y][x] <= threshold)
                {
                    result = false;
                }
            }
        }
        return result;
    }

    /*
     * invertSigne should return a new array with the signs inverted to all positive if positive is true
     * and all negative if positive is false.
     */ 
    public static int[][] invertSign(int[][] array, boolean positive)
    {
        int [][] result = new int [array.length][array[0].length];
        if (positive)
        {
            for (int y = 0; y < array.length; y ++)
            {
                for (int x = 0; x < array[0].length; x ++)
                {
                    if (array[y][x] < 0)
                    {
                        result [y][x] = -(array [y][x]);
                    }
                    else
                    {
                        result [y][x] = array [y][x];
                    }
                }
            }
        }
        else if (positive == false)
        {
            for (int y = 0; y < array.length; y ++)
            {
                for (int x = 0; x < array[0].length; x ++)
                {
                    if (array[y][x] < 0)
                    {
                        result [y][x] = array [y][x];
                    }
                    else
                    {
                        result [y][x] = - (array [y][x]);
                    }
                }
            }
        }
        return result;
    }

    /*
     * swapColumns should return a new array with the values in columns c1 and c2 from array swapped
     */
    public static int[][] swapColumns(int[][] array, int c1, int c2)
    {
        int [][] result = new int [array.length][array[0].length];
        for (int y = 0; y < array.length; y ++)
        {
            for (int x = 0; x < array[0].length; x ++)
            {
                if (x == c1)
                {
                    result [y][x] = array [y][c2];
                }
                else if (x == c2)
                {
                    result [y][x] = array [y][c1];
                }
                else
                    result [y][x] = array [y][x];
            }
        }
        return result;
    }
}
