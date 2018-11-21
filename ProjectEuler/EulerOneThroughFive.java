public class EulerOneThroughFive
{
    public static void EulerOne ()
    {
        int result = 0;
        for (int mult3 = 0; mult3 < 1000; mult3 += 3)
        {
            result += mult3;
        }
        for (int mult5 = 0; mult5 < 1000; mult5 += 5)
        {
            result += mult5;
        }
        for (int mult3And5 = 0; mult3And5 < 1000; mult3And5 += 15)
        {
            result -= mult3And5;
        }
        System.out.println (result);
    }

    public static void EulerTwo()
    {
        int result = 0;
        int first = 1;
        int second = 2;
        while (second < 4000000)
        {
            if (second % 2 == 0)
            {
                result += second;
                System.out.println (second);
            }
            int temporaryFirst = first;
            first = second;
            second += temporaryFirst;
        }
        System.out.println (result);
    }
}
