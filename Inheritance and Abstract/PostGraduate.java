
public class PostGraduate extends Graduate{
    PostGraduate(String name, String major, int units){
        super(name, major, units);
    }
    
    public int calculateTuition(){
        return (super.getUnits() * 750);
    }
}
