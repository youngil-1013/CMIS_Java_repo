public class Tester
{
    public static void main(String[] args){
        ArrayType at = ArrayType.RANDOM; //SORTED, RANDOM, or REVERSED
        int n = 10000;
        int[] array = Util.getArray(n, at);
        int[] tmp = array;
        long start, stop, btime, itime, stime, mtime;
        
        
        start = System.nanoTime();
        BubbleSort.sort(array);
        btime = System.nanoTime() - start;
        array = tmp;
        
        start = System.nanoTime();
        SelectionSort.sort(array);
        stime = System.nanoTime() - start;
        array = tmp;
        
        start = System.nanoTime();
        InsertionSort.sort(array);
        itime = System.nanoTime() - start;
        array = tmp;
        
        start = System.nanoTime();
        MergeSort.sort(array);
        mtime = System.nanoTime() - start;
        
        System.out.format(
        "BubbleSort: %d %d\n"+
        "SelectionSort: %d %d\n"+
        "InsertionSort: %d %d\n"+
        "MergeSort: %d %d\n", 
        btime, BubbleSort.steps, stime, SelectionSort.steps,  itime, InsertionSort.steps, mtime, MergeSort.steps);
    }
}
