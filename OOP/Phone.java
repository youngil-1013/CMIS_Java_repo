public class Phone
{
    private int yrProduced;
    private String producer;
    private double battery;
    
    public Phone()
    {
        yrProduced = 2018;
        producer = "Samsung";
        battery = 0.84;
    }
    
    public Phone(int yrProduced, String producer, double battery)
    {
        this.yrProduced = yrProduced;
        this.producer = producer;
        this.battery = battery;
    }
    
    public String toString ()
    {
        return ("Production Year:" + this.yrProduced + "\nProducer:" + this.producer +"\n" + battery + "% left");
    }
}
