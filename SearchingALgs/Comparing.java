public class Comparing
{
    public static int binCount = 0;
    public static int linCount = 0;
    public static void main(String[] args)
    {
        int n = 10;
        int[] array = new int[n];
        int v = (int)(Math.random() * n) - (n/2) ;
        for(int i = 0; i < n; i++)
        {
            System.out.println(v);
            array[i] = v;
            if(Math.random() <= 0.5)
            {
                v+= (int)(Math.random() * n);
            }
        }
        int key = Math.random() > 0.5 ? (int)(Math.random() * (array[n-1] - array[0])) + array[0] : array[(int)(Math.random() * array.length)];

        System.out.println("Binary Step: "+binCount);
        System.out.println("Linear Step: "+linCount);
    }

    public static int binsearch(int[] array, int value)
    {
        int front = 0;
        int back = array.length - 1 ;
        int matchIdx = -1;
        binCount +=4;
        while(front <= back)
        {
            int mid = (front + back) / 2; 
            int middleValue = array[mid];
            binCount += 5;
            if(middleValue == value)
            {
                matchIdx = mid;
                binCount += 2;
                break;
            }
            else if(value > middleValue)
            {
                front = mid + 1;
                binCount += 2;
            }
            else if(value < middleValue)
            {
                back = mid - 1;
                binCount += 2;
            }
        }
        binCount ++;
        return matchIdx;
    }

    public static int linear (int[] array, int num)
    {
        boolean found = false;
        int index = 0;
        while (index < array.length && !found)
        {
            if (array[index] == num)
            {
                return index;
            }
            else
            {
                index ++;
            }
        }
        return -1;
    }
}

