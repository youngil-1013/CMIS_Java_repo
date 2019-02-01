public class SelectionSort
{
    public static int steps = 0;
    public static void main(String[] args){
    }

    public static int[] sort(int[] array){
        int smallestIdx = 0;
        int temp;
        steps += 3;
        for(int s = 0; s < array.length; s++){
            steps += 4;
            smallestIdx = s;
            for(int n = s; n < array.length; n++){
                steps += 5;
                if(array[n] < array[smallestIdx]){
                    smallestIdx = n;
                    steps += 1;
                }
            }
            temp = array[smallestIdx];
            array[smallestIdx] = array[s];
            array[s] = temp;
            steps += 4;
        }
        steps += 1;
        return array;
    }
}