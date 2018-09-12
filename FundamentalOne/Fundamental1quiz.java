public class Fundamental1quiz
{
    public static int method1 (int a, int b, int c)
    {
        int A = a * b;
        int B = b * c;
        int C = c * a;
        int result = 0;
        if (A >= B && A >= C)
        {
            result = A;
        }
        else if (B >= A && B >= C)
        {
            result = B;
        }
        else if (C >= B && C >= A)
        {
            result = C;
        }
        return result;
    }

    public static int method2 (int a, int b)
    {
        int sum = 0;
        for (int start = 0; start <= a; start ++)
        {
            sum += start;
        }
        int result = sum * b;
        return result;
    }

    public static String method3 (int h, int w)
    {
        String result;
        if ((h % 2 == 1) && (w % 2 == 1))
        {
            int middlePosition = w/2;
            int halfMinusOne = (w/2);
            String normalWidth = "";
            String specialWidth = "";
            String frontBack = "";

            for (int wposit = 0; wposit < w; wposit ++)
            {
                if (wposit == middlePosition)
                {
                    normalWidth += "|";
                    specialWidth += "+";
                }
                else
                {
                    normalWidth += " ";
                    specialWidth += "-";
                }
            }
            normalWidth += "\n";
            specialWidth += "\n";
            for (int repeatposit = 1; repeatposit < halfMinusOne; repeatposit ++)
            {
                frontBack += normalWidth;
            }
            result = frontBack + specialWidth + frontBack;
        }
        else
        {
            result = "+";
        }
        System.out.println (result);
        return result;
    }
}