import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor implements Shootable 
{
    private int rate;
    private int damage = 5;

    public Laser(){
        GreenfootImage image = getImage();
        image.scale(getImage().getWidth()*2, getImage().getHeight()/2); 
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

    public void incDamage(int amount){
        damage += amount;
    }
}

