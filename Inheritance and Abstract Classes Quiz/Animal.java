import java.util.*;
public abstract class Animal{
    private List<Integer> location;
    private String graphic;
    public Animal(int x, int y){
	graphic = new String();
	location = new ArrayList<Integer>();
	location.add(x);
	location.add(y);
    }

    public abstract boolean eat(String what);

    public void move(int dx, int dy){
	if(Math.abs(dx) <= 1 && Math.abs(dy) <= 1){
	    int newX = location.get(0) + dx;
	    int newY = location.get(1) + dy;
	    setLocation(newX, newY);
	}
    }

    private void setLocation(int newX, int newY){
	location.set(0, newX);
	location.set(1, newY);
    }

    public List<Integer> getLocation(){
	return location;
    }

    public void setGraphic(String newGraphic){
	graphic = newGraphic;
    }

    public String getGraphic(){
	return graphic;
    }

    public String toString(){
	return "I am an instance of a concrete class that extends Animal.";
    }
}