public class BubbleSort
{
    public static int steps = 0;
    public static void main(String[] args){

    }

    public static int[] sort(int[] array){
        boolean sorted = false;
        steps += 1;
        while(!sorted){
            steps += 3;
            sorted = true;
            for(int i = 0;i < array.length-1; i++){
                steps += 5;
                if(array[i] > array[i + 1]){
                    steps += 7;
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    sorted = false;
                }
            }
        }
        steps += 1;
        return array;
    }
}
