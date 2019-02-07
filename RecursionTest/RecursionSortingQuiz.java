public class RecursionSortingQuiz
{
    public static void main(String[] args){
        System.out.println("I'm ready to serve you!");
        int [] test = new int [] {1,1,-7,18,2};
        kiefferSort (test);
    }

    /**
     * @param n the value
     * @return n!
     * 
     * Factorials
     * n! => n * n-1 * n-2 * ... * n -(n-1)
     * 10! => 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 => 3628800
     * 5! => 5 * 4 * 3 * 2 * 1 => 120
     * 0! => 1
     */
    public static int factorial(int n){
        if (n == 0)
        {
            return 1;
        }
        else if (n == 1)
        {
            return 1;
        }
        else 
        {
            return n * factorial(n - 1);
        }
    }

    /**
     * @param array the array to be sorted
     * @return the array sorted
     */
    public static int[] kiefferSort(int[] array){
        boolean sorted = true;
        for (int idx = 0; idx < array.length - 1; idx ++)
        {
            if (array[idx] > array[idx + 1])
            {
                sorted = false;
            }
        }
        if (!sorted)
        {
            int [] swaparray = new int [array.length];
            for (int idx = 0; idx < array.length; idx ++)
            {
                swaparray[idx] = array[idx];
            }
            int rdm = 1 + (((int) (Math.random() * (array.length - 1))));
            int idxZero = array[0];
            int idxRdm = array[rdm];
            swaparray[0] = idxRdm;
            swaparray[rdm] = idxZero;
            return kiefferSort(swaparray);
        }
        else 
        {
            for (int idx = 0; idx < array.length; idx ++)
            {
                System.out.println (array[idx]);
            }
            return array;
        }
    }
}