public class addOne 
{
    public static void main(String augs[])
    {
        String example = "11011";
        String back = "";
        String front = "";
        boolean TF = true;
        for (int n = example.length(); TF; n--)
        {    
            if (example.substring(n - 1, n).equals("1"))
            {
                back += "0";
            }
            else if (example.substring(n - 1, n).equals("0"))
            {
                front += example.substring(0, n-1) + "1";
                TF = false;
            }
        }
        System.out.println(front + back);
    }
}
    /*
    if ((binResult.substring(a,a+1).equals("1")))
    {  
    negResult += "0";
    }
    else if ((binResult.substring(a,a+1).equals("0")))
    {
    negResult += "1";
    }
     */