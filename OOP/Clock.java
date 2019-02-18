public class Clock
{
    private int hr;
    private int min;
    private int sec;

    public Clock ()
    {
        hr = 0;
        min = 0;
        sec = 0;
    }

    public Clock (int hour, int minute, int second)
    {
        this();
        this.hr = hour;
        this.min = minute;
        this.sec = second;
    }

    public String toString()
    {
        return String.format("The time is %d:%d:%d", hr, min, sec);
    }
}
