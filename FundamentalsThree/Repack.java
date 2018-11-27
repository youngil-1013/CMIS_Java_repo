public class Repack
{

    public static void main(String[] args){
        int[][] array = getArray(5, 5, true);
        print(array);
        print(repack(array, 3));
    }

    public static int[][] repack(int[][] array, int w){
        int [][] repacked = new int[array.length][array[0].length];
        int [] oneDArr = new int [repacked.length * repacked[0].length];
        int oneDPosit = 0;

        for (int twoDY = 0; twoDY < array.length; twoDY ++)
        {
            for (int twoDX = 0; twoDX < array[0].length; twoDX ++)
            {
                oneDArr [oneDPosit] = array [twoDY][twoDX];
                oneDPosit ++;
            }
        }

        for(int x = 0; x < oneDArr.length; x++){
            System.out.println (oneDArr[x]);
        }

        int arrPosit = 0;

        for (int reY = 0; reY < (oneDArr.length / w) - 1; reY ++)
        {
            for (int reX = 0; reX < w; reX ++)
            {
                if (arrPosit < (array.length * array[0].length / w) - 1)
                {
                    repacked [reY][reX] = oneDArr [arrPosit];
                    arrPosit ++;
                }
                else
                {
                    repacked [reY][reX] = 0;
                }
            }
        }

        return repacked;

    }

    public static int[][] getArray(int h, int w, boolean random){
        int[][] array = new int[h][w];
        int ct = 0;
        for(int y = 0; y < h; y++){
            for(int x = 0; x < w; x++){
                if(random){
                    int v = (int)(Math.random() * 20000) * (Math.random() > 0.4 ? -1 : 1);
                    array[y][x] = v == 0 ? 1 : v;
                }else{
                    array[y][x] = ct++;
                }
            }
        }
        return array;
    }

    public static void print(int[][] array){
        String out = "{";
        for(int y = 0; y < array.length; y++){
            out += "{";
            for(int x = 0; x < array[y].length; x++){
                out += array[y][x];
                if(x != array[y].length -1)
                    out += ", ";
            }
            out += "}";
            if( y != array.length -1)
                out+=",\n";
        }
        out+= "}\n";
        System.out.println(out);
    }
}

