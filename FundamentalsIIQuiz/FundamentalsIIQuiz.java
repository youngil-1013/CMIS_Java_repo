
public class FundamentalsIIQuiz
{
    public static int [] minmax (int [] array)
    { 
        int [] result = new int [2];
        int min = 0;
        int max = 0;
        for (int position = 0; position < array.length; position ++)
        {
            if (array[position] > max)
            {
                max = array[position];
            }
            else if (array[position] < min)
            {
                min = array[position];
            }
        }
        result [0] = min;
        result [1] = max;
        return result;
    }

    public static int [] filter(int [] array, int min, int max, boolean positive)
    {
        int resultLength = 0;
        int resultPosit = 0;
        int [] result;
        if (positive == true)
        {
            for (int position = 0; position < array.length; position ++)
            {    
                if (min <= array [position] && array [position] <= max)
                {        
                    resultLength ++;
                }
            }
            result = new int [resultLength];
            for (int position = 0; position < array.length; position ++)
            {    
                if (min <= array [position] && array [position] <= max)
                {        
                    result [resultPosit] = array [position];
                    resultPosit ++;
                }
            }
        }
        else
        {
            for (int position = 0; position < array.length; position ++)
            {    
                if (min > array [position] || array [position] > max)
                {        
                    resultLength ++;
                }
            }
            result = new int [resultLength];
            for (int position = 0; position < array.length; position ++)
            {    
                if (min > array [position] || array [position] > max)
                {        
                    result [resultPosit] = array [position];
                    resultPosit ++;
                }
            }
        }
        return result;
    }
}
