

public class UnderGrad extends Student{
    UnderGrad(String name, String major, int units){
        super(name, major, units);
    }
    
    public int calculateTuition(){
        return (super.getUnits() * 250);
    }
}



