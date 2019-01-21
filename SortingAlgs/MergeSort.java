public class MergeSort
{
    public static int[] MergeSort(int[] array)
    {
        if (array.length != 1)
        {
            int[] Front = new int [array.length/2];
            int[] Back = new int [1 - (array.length/2)];
            MergeSort (Front);
            MergeSort (Back);
            int[] UnsortedMerge = Front + Back;
            
        }
        else
        {
            return array;
        }
    }
}
