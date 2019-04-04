import java.util.*;
public class Bird extends Animal{
    private List<Integer> location;
    private String colour;
    Bird(int x, int y, String colour){
        super(x, y);
        this.colour = colour;
        super.setGraphic ("   \\ \n   (o> \n\\\\_//) \n \\_/_) \n  _|_ \n");
    }

    public boolean eat(String what){
        if (what == "worms" || what == "seeds"){
            return true;
        }else{
            return false;
        }
    }

    public void fly(int x, int y){
        location = super.getLocation();
        location.set(0, x);
        location.set(1, y);
    }

    public String getColor(){
        return colour;
    }

    public String toString(){
        String out = "";
        out += "Bird\n" + super.getGraphic() + "\n";

        location = super.getLocation();
        int x = location.get(0);
        int y = location.get(1);

        out += "x: " + x + "\n";
        out += "y: " + y + "\n";
        out += super.toString();
        return out;
    }
}