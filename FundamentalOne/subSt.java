public class subSt
{
    public static void main (String args[])
    {   
        String XD = "";
        String Boi = "0100";
        for (int a = 0; a < 4; a++)
        {
            if ((Boi.substring(a,a+1).equals("1")))
            {
                XD += "0";
            }
            else if ((Boi.substring(a,a+1).equals("0")))
            {
                XD += "1";
            }
            else
            {
                System.out.print("Err");
            }
        }
        System.out.print(XD);
    }

    public static void SOS()
    {
        String num = "01234";
        String Yes = num.substring(4,5);
        System.out.print(Yes);
        if (Yes.equals("4"))
            System.out.print (true);
        else 
        System.out.print (false);
    }
}
