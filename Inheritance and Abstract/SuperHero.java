public abstract class SuperHero{
    private String suitColor;
    private boolean hasCape;

    public SuperHero(){
        this.suitColor = new String();
        this.hasCape = false;
    } // end zero-arg constructor SuperHero

    public void setSuitColor(String suitColor){
        this.suitColor = new String( suitColor );
    } // end method setSuitColor

    public String getSuitColor(){
        return suitColor;	
    } // end method getSuitColor

    public void setCape(boolean cape){
        this.hasCape = cape;	
    } // end method setCape

    public boolean isCaped(){
        return hasCape;	
    } // end method isCaped

    public String toString(){
        return isCaped() + "\t" + getSuitColor() + "\t" + motto();
    }

    public abstract String motto();  
    public abstract String getHero();
} // end abstract class SuperHero

