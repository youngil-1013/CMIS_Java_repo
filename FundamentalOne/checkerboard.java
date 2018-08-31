public class checkerboard { 
    public static void checkerboard (int height,int width)
    {
        String topBottomBorder = "+";
        for (int w = width; w >= 1; w--)
        {
            topBottomBorder += "-";
        }
        topBottomBorder += "+";//End of building top and bottom lines
        String middlePart = "";
        int hRdm=(int) (Math.random()*(height / 2));
        hRdm = hRdm * 2 + 1;
        int wRdm = (int)(Math.random()*(width / 2));
        wRdm = wRdm * 2 + 1;
        int Rdm = (int)(Math.random()*(10));
        for (int h = height; h > 0; h--)
        {
            if (h%2 == 1)
            {
                middlePart += "|";
                for (int w = width; w > 0; w--)
                {
                    if (w%2 ==1 && w == hRdm && h ==hRdm)
                        middlePart += String.format("%d",Rdm);
                    else if (w%2 == 1)
                        middlePart += "#";
                    else if (w%2 == 0)
                        middlePart += " ";
                }
                middlePart += "|\n";
            }
            if (h%2 == 0)
            {
                middlePart += "|";
                for (int w = width; w > 0; w--)
                {
                    if (w%2 == 0 && w == hRdm && h ==hRdm)
                        middlePart += String.format("%d",Rdm);
                    if (w%2 == 0)
                        middlePart += "#";
                    else if (w%2 == 1)
                        middlePart += " ";
                }
                middlePart += "|\n";
            }
        }
        System.out.println(topBottomBorder);
        System.out.print(middlePart);
        System.out.println(topBottomBorder);
    }
}