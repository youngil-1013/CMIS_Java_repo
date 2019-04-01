public class DLP extends Television{
    DLP(){
        super("Default DLP", 3000.0);
    }

    DLP(String model, double cost){
        super("DLP" + model, cost);
    }
}