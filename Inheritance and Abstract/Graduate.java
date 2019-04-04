public class Graduate extends Student{
    Graduate(String name, String major, int units){
        super(name, major, units);
    }
    
    public int calculateTuition(){
        return (super.getUnits() * 500);
    }
}