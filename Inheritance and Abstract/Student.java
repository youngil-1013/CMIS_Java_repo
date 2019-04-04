public abstract class Student{
    private String name;
    private String major;
    private int units;
    
    Student(String name, String major, int units){
        this.name = name;
        this.major = major;
        this.units = units;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getMajor(){
        return major;
    }
    
    public void setMajor(String major){
        this.major = major;
    }
    
    public int getUnits(){
        return units;
    }
    
    public void setUnits(int units){
        this.units = units;
    }
    
    public String toString(){
        String out = "";
        out += "Name: " + name + "|Major: " + major + "|Tuition: $" + calculateTuition() + "(" + units + " units)";
        return out;
    }
    abstract public int calculateTuition();
}
