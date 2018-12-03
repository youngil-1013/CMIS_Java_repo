public class BubbleSort
{
    public static void main(String[] args){
        int[] array = getArray(200000, true);
        print(array);
        sort(array);
        print(array);
    }

    public static int[] sort(int[] array){
        boolean switched = false;
        int tempSmallInt = 0;
        int tempBigInt = 0;
        while (switched == false)
        {
            switched = true;
            for (int posit = 0; posit < array.length - 1; posit ++)
            {
                if (array[posit] > array[posit + 1])
                {
                    tempSmallInt = array[posit];
                    tempBigInt = array[posit + 1];
                    array[posit] = tempBigInt;
                    array[posit + 1] = tempSmallInt;
                    switched = false;
                }
            }
        }
        return array;
    }

    public static int[] getArray(int w, boolean random){
        int[] array = new int[w];
        int ct = 0;
        for(int i = 0; i < w; i++)
        {
            if(random)
                array[i] = (int)(Math.random() * 20000) * (Math.random() > 0.4 ? -1 : 1);
            else
                array[i] = ct++;
        }
        return array;
    }

    public static void print(int[] array){
        String out = "{";
        for(int i = 0; i < array.length; i++)
        {
            out += array[i];
            if( i != array.length -1)
                out+=", ";
        }
        out+= "}\n";
        System.out.println(out);
    }
}