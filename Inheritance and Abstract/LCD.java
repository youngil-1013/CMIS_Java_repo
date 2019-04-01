public class LCD extends Television{
    LCD(){
        super("Default LCD", 4000.0);
    }

    LCD(String model, double cost){
        super("LCD" + model, cost);
    }
}
