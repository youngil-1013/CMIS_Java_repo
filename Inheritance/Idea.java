public class Idea extends Entity
{
    private int popularity;

    public int getPopularity(){
        return popularity;
    }

    public void setPopularity(int popularity){
        this.popularity = popularity;
    }

    Idea(){
        super("Default Idea");
    }

    Idea(String name){
        super(name);
    }

    public String toString(){
        String out = "";
        out += super.toString();
        out += "popularity: " + popularity + "\n";
        return out;
    }
}