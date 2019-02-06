public class Binary
{
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
        System.out.println("Key: "+3);
        System.out.println("Index: "+search(new int [] {1,2,3,3,3}, 3, false));
    }

    public static int search(int[] array, int value, boolean frontIdx)
    {
        //true = front, false = back
        int front = 0;
        int back = array.length - 1 ;
        int matchIdx = -1;
        while(front <= back)
        {
            int mid = (front + back) / 2; 
            int middleValue = array[mid];
            if(middleValue == value)
            {
                matchIdx = mid;
                if (frontIdx)
                {
                    while (matchIdx >= 1 && array[matchIdx - 1] == middleValue)
                    {
                        matchIdx --;
                    }
                }
                else
                {
                    while (matchIdx < array.length - 1 && array[matchIdx + 1] == middleValue)
                    {
                        matchIdx ++;
                    }
                }
                break;
            }
            else if(value > middleValue)
            {
                front = mid + 1;
            }
            else if(value < middleValue)
            {
                back = mid - 1;
            }
        }
        return matchIdx;
    }
}