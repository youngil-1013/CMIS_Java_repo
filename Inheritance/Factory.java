public class Factory extends Place{
    private String production;
    
    Factory(){
        super("Default Factory");
    }
    
    Factory(String name){
        super(name);
    }
    
    Factory(String name, String production){
        super(name);
        this.production = production;
    }
    
    public String toString(){
        String out = "";
        out += super.toString();
        out += "produce: "+ production;
        return out;
    }
}