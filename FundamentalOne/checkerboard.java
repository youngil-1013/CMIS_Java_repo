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
        while (height > 0)
        {
            int w = width;
            if (height%2 ==1)
            {
                while(w >= 0)
                {
                    if (w == width)
                    {
                        middlePart += "|#";
                        w--;
                    }
                    else if (w == 0)
                    {
                        middlePart += "|";
                        w--;
                    }

                    else if (w%2 == 1)
                    {
                        middlePart += "#";
                        w--;
                    }
                    else if (w%2 == 0)
                    {
                        middlePart += " ";
                        w--;
                    }
                }
                middlePart += "\n";
            }
            
            else if (height%2 ==1)
            {
                while(w >= 0)
                {
                    if (w == width)
                    {
                        middlePart += "|#";
                        w--;
                    }
                    else if (w == 0)
                    {
                        middlePart += "|";
                        w--;
                    }

                    else if (w%2 == 0)
                    {
                        middlePart += "#";
                        w--;
                    }
                    else if (w%2 == 1)
                    {
                        middlePart += " ";
                        w--;
                    }
                }
                middlePart += "\n";
            }
            height--;

        }
        System.out.print(middlePart);
    }
}