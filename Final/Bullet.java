import greenfoot.*;
/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor 
{   
    private int rate;
    private int velocity;
    private int damage = 5;

    public Bullet(){
        GreenfootImage image = getImage();
        image.scale(10,10);
        setImage(image);
    }

    public void border(){
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }

    public void act(){
        move(20);
        border();
    }
    
    public int getDamage(){
        return damage;
    }
}
