public class SelectionSort
{
    public static int steps = 0;
    public static void main(String[] args){
    }

    public static int[] sort(int[] array){
        int smallestIdx = 0;
        int temp;
        for(int s = 0; s < array.length; s++){
            smallestIdx = s;
            for(int n = s; n < array.length; n++){
                if(array[n] < array[smallestIdx]){
                    smallestIdx = n;
                }
            }
            temp = array[smallestIdx];
            array[smallestIdx] = array[s];
            array[s] = temp;
        }
        return array;
    }
}