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
        String negResult = "";
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
            return (binResult);
        }
        else if (dec < 0)
        {
            for (int posit = 31; posit >= 0; posit--)
            {
                if (dec + java.lang.Math.pow (2,posit) < 0)
                {
                    binResult += "1";
                    dec = dec - (int)java.lang.Math.pow (2,posit);
                }   
                else if (dec + java.lang.Math.pow (2,posit) >= 0)
                {
                    binResult += "0";
                }
            }
            for (int a = 0; a < binResult.length(); a++)
            {
                if ((binResult.substring(a,a+1).equals("1")))
                {
                    negResult += "0";
                }
                else if ((binResult.substring(a,a+1).equals("0")))
                {
                    negResult += "1";
                }
            }
            binResult = negResult;
        }
        return binResult;
    }
}

//public static int bin2dec(String bin){
/*
 * Takes a String that looks like a 32-bit binary number and returns
 * the equivalent int value
 */
//return 0;

