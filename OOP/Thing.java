public class Thing
{
    private int Integer = 10;
    private boolean Bool = false;
    private double Doub = 0.6;
    private String Str = "teey";

    public Thing()
    {
        this.Integer = 16;
        this.Bool = false;
        this.Doub = 1111.6;
        this.Str = "yete";
    }
    
    public Thing (int fieldvalue)
    {
        this();
        this.Integer = fieldvalue;
    }
    
    public Thing (boolean fieldvalue)
    {
        this(1);
        this.Bool = fieldvalue;
    }
    
    public Thing (double fieldvalue)
    {
        this(false);
        this.Doub = fieldvalue;
    }
    
    public void setInteger(int newValue)
    {
        this.Integer = newValue;
    }

    public void setBool(boolean newValue)
    {
        this.Bool = newValue;
    }

    public void setStr(String newValue)
    {
        this.Str = newValue;
    }

    public void setDoub(double newValue)
    {
        this.Doub = newValue;
    }

    public int getInteger()
    {
        return Integer;
    }

    public boolean getBool()
    {
        return Bool;
    }

    public double getDoub()
    {
        return Doub;
    }

    public String getStr()
    {
        return Str;
    }
}