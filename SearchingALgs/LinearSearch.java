public class LinearSearch
{
    public static void main (String args[])
    {
        int[] arr = {1,2,3,4,5};
        System.out.println(linear(arr,1));
        System.out.println(linear(arr,0));
    }

    public static int linear (int[] array, int num)
    {
        boolean found = false;
        int index = 0;
        while (index < array.length && !found)
        {
            if (array[index] == num)
            {
                return index;
            }
            else
            {
                index ++;
            }
        }
        return -1;
    }
}
