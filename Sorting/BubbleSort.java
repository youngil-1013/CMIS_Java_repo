public class BubbleSort
{
    public static int steps = 0;
    public static void main(String[] args){

    }

    public static int[] sort(int[] array){
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 0;i < array.length-1; i++){
                if(array[i] > array[i + 1]){
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    sorted = false;
                }
            }
        }
        return array;
    }
}
