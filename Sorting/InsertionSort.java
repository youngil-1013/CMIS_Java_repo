public class InsertionSort
{
    public static int steps = 0;
    public static void main(String[] args){
    }

    public static int[] sort(int[] array){
        int temp;
        steps += 2;
        for(int forwards = 1; forwards < array.length; forwards++){
            steps += 3;
            for(int backwards = forwards; backwards > 0; backwards--){
                steps += 4;
                if(array[backwards] < array[backwards-1]){
                    steps += 4;
                    temp = array[backwards-1];
                    array[backwards-1] = array[backwards];
                    array[backwards] = temp;
                }
            }
        }
        steps += 1;
        return array;
    }
}