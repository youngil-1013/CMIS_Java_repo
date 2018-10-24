public class TwoDArray
{
    public static void main(String[] args)
    {
        int [][] mainArray = defaultArray(3, 4);
        for (int y = 0; y < mainArray.length; y ++)
        {     
            for (int x = 0; x < mainArray[y].length; x ++)
            {
                System.out.print(mainArray[y][x] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] defaultArray(int h, int w)
    {
        int [][] result = new int [h][w];
        int num = 1;
        for (int height = 0; height < h; height ++)
        {
            for (int width = 0; width < w; width ++)
            {
                result [height][width] = num;
                num ++;
            }
        }
        return result;
    }

}
