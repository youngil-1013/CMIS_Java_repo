public class InsertionSort
{
    public static int steps = 0;
    public static void main(String[] args){
    }

    public static int[] sort(int[] array){
        int temp;
        for(int forwards = 1; forwards < array.length; forwards++){
            for(int backwards = forwards; backwards > 0; backwards--){
                if(array[backwards] < array[backwards-1]){
                    temp = array[backwards-1];
                    array[backwards-1] = array[backwards];
                    array[backwards] = temp;
                }
            }
        }
        return array;
    }
}