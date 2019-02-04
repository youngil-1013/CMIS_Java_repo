public class Avg
{
    public static void main(String[] args){
        ArrayType at = ArrayType.SORTED; //SORTED, RANDOM, or REVERSED
        int n = 0;
        int[] array = Util.getArray(n, at);
        int[] tmp = new int[array.length];
        for(int i = 0; i < array.length; i++){
            tmp[i] = array[i];
        }
        long start, stop, btime, itime, stime, mtime;
        long[] valTemp = new long [50];
        long avgTemp = 0;
        long avgB, avgS, avgI, avgM;

        for (int times = 0; times < 50; times ++)
        {
            start = System.nanoTime();
            BubbleSort.sort(array);
            btime = System.nanoTime() - start;
            valTemp[times] = btime;
        }
        for (long val: valTemp)
        {
            avgTemp += val;
        }
        avgB = avgTemp/10;
        avgTemp = 0;
        for(int i = 0; i < array.length; i++){
            tmp[i] = array[i];
        }
        for (int times = 0; times < 50; times ++)
        {
            start = System.nanoTime();
            SelectionSort.sort(array);
            stime = System.nanoTime() - start;
            valTemp[times] = stime;
        }
        for (long val: valTemp)
        {
            avgTemp += val;
        }
        avgS = avgTemp/10;
        avgTemp = 0;
        for(int i = 0; i < array.length; i++){
            tmp[i] = array[i];
        }
        for (int times = 0; times < 50; times ++)
        {
            start = System.nanoTime();
            InsertionSort.sort(array);
            itime = System.nanoTime() - start;
            valTemp[times] = itime;
        }
        for (long val: valTemp)
        {
            avgTemp += val;
        }
        avgI = avgTemp/10;
        avgTemp = 0;
        for(int i = 0; i < array.length; i++){
            tmp[i] = array[i];
        }
        for (int times = 0; times < 50; times ++)
        {
            start = System.nanoTime();
            MergeSort.sort(array);
            mtime = System.nanoTime() - start;
            valTemp[times] = mtime;
        }
        for (long val: valTemp)
        {
            avgTemp += val;
        }
        avgM = avgTemp/10;

        System.out.format(
            "BubbleSort: %d\n"+
            "SelectionSort: %d\n"+
            "InsertionSort: %d\n"+
            "MergeSort: %d\n", 
            avgB, avgS, avgI, avgM);

    }
}
