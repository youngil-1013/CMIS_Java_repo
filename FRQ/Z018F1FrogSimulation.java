public class Z018F1FrogSimulation
{
    private int goalDistance;
    private int maxHops;
    public Z018F1FrogSimulation (int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance ()
    {
        return ((int) ((Math.random()* (-30)) + 15));
    }

    public boolean simulate ()
    {
        int distance = 0;
        for (int hop = 0; hop < maxHops; hop ++)
        {
            distance += hopDistance();
            if (distance < 0)
            {
                return false;
            }
            else if (distance > goalDistance)
            {
                return true;
            }
        }
        return false;
    }

    public double runSimulations (int num)
    {
        int success = 0;
        int total = 0;
        for (int times = 0; times < num; times ++)
        {   
            if (simulate() == true)
            {
                success ++;
                total ++;
            }
            else
            {
                total ++;
            }
        }
        return (double) success/total;
    }
}