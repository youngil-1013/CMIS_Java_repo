public class TourSpot extends Place{
    private int entryFee;

    TourSpot(){
        super("Default Tour Spot");
    }

    TourSpot(String name){
        super(name);
    }

    TourSpot(String name, String production){
        super(name);
        this.entryFee = entryFee;
    }
    
    public int ageSpot(){
        return getAge();
    }

    public String toString(){
        String out = "";
        out += super.toString();
        out += "Entry Fee: "+ entryFee;
        return out;
    }
}