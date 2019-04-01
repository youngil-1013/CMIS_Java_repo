public class Plasma extends Television{
    Plasma(){
        super("Default Plasma", 3000.0);
    }
    
    Plasma(String model, double cost){
        super("Plasma" + model, cost);
    }
}