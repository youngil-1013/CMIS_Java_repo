public class LED extends Television{
    LED(){
        super("Default LED", 8000.0);
    }

    LED(String model, double cost){
        super("LED" + model, cost);
    }
}
