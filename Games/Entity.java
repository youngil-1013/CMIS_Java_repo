import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Entity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entity extends Actor
{
    /**
     * Act - do whatever the Entity wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int exp;
    private int level;
    private int health;
    private int ad;

    public Entity(){
        GreenfootImage image = getImage();
        image.scale(25,25);
        setImage(image);
    }    

    public Entity(int level, int exp, int health, int ad){
        this.exp = exp;
        this.level = level;
        this.health = health;
        this.ad = ad;
        GreenfootImage image = getImage();
        image.scale(25,25);
        setImage(image);
    }    

    public int getExp(){
        return exp;
    }

    public int getLevel(){
        return level;
    }

    public int getHealth(){
        return health;
    }

    public int getAD(){
        return ad;
    }

    public void setExp(int exp){
        this.exp = exp;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setAD(int ad){
        this.ad = ad;
    }
    
    public String toString(){
        String out = "";
        out += "Level:  " + getLevel() + "\n";
        out += "Damage: " + getAD() + "\n";
        out += "Health: " + getHealth() + "\n";
        return out;
    }

    public void act() 
    {
        // Add your action code here.
    }    
}
