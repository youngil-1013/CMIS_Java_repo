public class Place extends Entity
{
    private int population;

    public int getPopulation(){
        return population;
    }

    public void setPopulation(int pop){
        this.population = pop;
    }

    Place(){
        super("Default Place");
    }

    Place(String name){
        super(name);
    }

    public String toString(){
        String out = "";
        out += super.toString();
        out += "population: " + population + "\n";
        return out;
    }
}