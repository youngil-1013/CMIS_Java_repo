public class SelectionSort
{
    public static void main(String[] args){
        int[] numbers = new int[15];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        sort(numbers);
        print(numbers);
    }

    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }

    public static void sort(int[] array){
        int temp = array[0];
        int indexofTemp = 0;
        for (int index = 0; index < array.length; index ++)
        {
            for (int scanIndex = index; scanIndex < array.length; scanIndex ++)
            {
                if (scanIndex == index)
                {
                    temp = array[scanIndex];
                    indexofTemp = scanIndex;
                }
                else
                {
                    if (array[scanIndex] < temp)
                    {
                        temp = array[scanIndex];
                        indexofTemp = scanIndex;
                    }
                }
            }
            int tempSwitched = array[index];
            array[index] = temp;
            array[indexofTemp] = tempSwitched;
        }
    }
}