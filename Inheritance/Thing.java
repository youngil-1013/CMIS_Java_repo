public class Thing extends Entity
{
    private int volume;

    public int getVolume(){
        return volume;
    }

    public void setPopulation(int volume){
        this.volume = volume;
    }

    Thing(){
        super("Default Thing");
    }

    Thing(String name){
        super(name);
    }

    public String toString(){
        String out = "";
        out += super.toString();
        out += "volume: " + volume + "\n";
        return out;
    }
}