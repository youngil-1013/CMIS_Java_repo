import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor implements Shootable 
{
    private int damage;

    public Laser(){
    }

    public Laser(int damage){
        this.damage = damage;
        GreenfootImage image = getImage();
        image.scale(getImage().getWidth()/2, getImage().getHeight()/8); 
        setImage(image);
    }

    public void border(){
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }

    public void act(){
        move(4);
        border();
    }

    public int getDamage(){
        return damage;
    }

    public void incDamage(int amount){
        damage += amount;
    }
}

