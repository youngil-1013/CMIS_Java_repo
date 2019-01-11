public class InsertionSort
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
        for (int index = 1; index < array.length; index ++)
        {
            int subtractBy = 0;
            while (array[index - subtractBy] < array[index - subtractBy - 1])
            {
                int current = array[index - subtractBy];
                array[index - subtractBy] = array[index - subtractBy-1];
                array[index - subtractBy-1] = current;
                if (index - subtractBy != 1)
                {
                    subtractBy ++;
                }
            }
        }
    }
}