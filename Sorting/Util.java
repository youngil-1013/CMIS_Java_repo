public class Util
{
    public static int[] getArray(int w, ArrayType arrayType){
        int[] array = new int[w];
        int ct = 0;
        switch(arrayType){
            case SORTED:
                for(int i = 0; i < w; i++){
                    array[i] = i;
                }
                break;
            case RANDOM:
                for(int i = 0; i < w; i++){
                    array[i] = (int)(Math.random() * 200) - 100;
                }
                break;
            case REVERSED:
                for(int i = 0; i < w; i++){
                    array[i] = w - i - 1;
                }
                break;
        }
        return array;
    }

    public static void print(int[] array){
        String out = "{";
        for(int i = 0; i < array.length; i++){
            out += array[i];
            if( i != array.length -1)
                out+=", ";
        }
        out+= "}\n";
        System.out.println(out);
    }
}
