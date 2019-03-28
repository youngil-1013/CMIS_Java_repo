public class Entity
{
    private String name;
    public Entity(String name)
    {
        this.name = name;
    }
    
    public String toString()
    {
        String out = "";
        out += super.toString() + "\n";
        out += "name: " + name + "\n";
        return out;
    }
}
