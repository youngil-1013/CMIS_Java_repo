public class TesterRe

{
    public static void main(String[] args){
        ArrayType at = ArrayType.RANDOM; //SORTED, RANDOM, or REVERSED
        int n = 100;
        int[] array = Util.getArray(n, at);
        int[] tmp = new int[array.length];
        for(int i = 0; i < array.length; i++){
            tmp[i] = array[i];
        }
        long start, stop, btime, itime, stime, mtime;
        System.out.format("%d Unsorted Integers\n", n);

        System.out.println("1");
        Util.print(array);
        Util.print(tmp);

        start = System.nanoTime();
        BubbleSort.sort(array);
        btime = System.nanoTime() - start;

        Util.print(array);
        System.out.println("2");
        for(int i = 0; i < array.length; i++){
            array[i] = tmp[i];
        }
        Util.print(tmp);

        start = System.nanoTime();
        SelectionSort.sort(array);
        stime = System.nanoTime() - start;

        Util.print(array);
        System.out.println("3");
        for(int i = 0; i < array.length; i++){
            array[i] = tmp[i];
        }
        Util.print(tmp);

        start = System.nanoTime();
        InsertionSort.sort(array);
        itime = System.nanoTime() - start;

        Util.print(array);
        System.out.println("4");
        for(int i = 0; i < array.length; i++){
            array[i] = tmp[i];
        }
        Util.print(tmp);

        start = System.nanoTime();
        MergeSort.sort(array);
        mtime = System.nanoTime() - start;

        Util.print(array);
        System.out.println("5");
        for(int i = 0; i < array.length; i++){
            array[i] = tmp[i];
        }
        Util.print(tmp);

        System.out.println("SORTED");

        System.out.format(
            "BubbleSort: %d %d\n"+
            "SelectionSort: %d %d\n"+
            "InsertionSort: %d %d\n"+
            "MergeSort: %d %d\n", 
            btime, BubbleSort.steps, stime, SelectionSort.steps,  itime, InsertionSort.steps, mtime, MergeSort.steps);
    }
}