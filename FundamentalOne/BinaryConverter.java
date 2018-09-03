import java.util.Scanner;
public class BinaryConverter
{
    public static void main(String args[]){
        System.out.println("BinaryConverter");
        Scanner Scan = new Scanner (System.in) ;
        int Integer = Scan.nextInt() ;
        dec2bin(Integer);
    }

    public static String dec2bin(int dec){
        String binResult = "";
        if (dec >= 0)
        {
            for (int posit = 31; posit >= 0; posit--)
            {
                if (dec - java.lang.Math.pow (2,posit) >= 0)
                {
                    binResult += "1";
                    dec = dec - (int)java.lang.Math.pow (2,posit);
                }   
                else if (dec - java.lang.Math.pow (2,posit) < 0)
                {
                    binResult += "0";
                }
            }
        }
        else if (dec < 0)

        System.out.println (binResult);
        return (binResult);
    }

    public static int bin2dec(String bin){
        /*
         * Takes a String that looks like a 32-bit binary number and returns
         * the equivalent int value
         */
        return 0;

    }
}