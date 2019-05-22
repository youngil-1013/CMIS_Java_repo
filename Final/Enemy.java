import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private int health = 10;
    public Enemy(){
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
    }

    public void act() 
    {
        move(-1);
        if (intersect()){
            damage();
        }
        if (health <= 0){
            this.getWorld().removeObject(this);
        }
    }    

    public void damage(){
        Actor bullet = (Bullet) getOneIntersectingObject(Bullet.class);
        this.health -= bullet.getDamage();
    }

    public boolean intersect(){
        if(getOneIntersectingObject(Bullet.class) != null){
            return true;
        }else{
            return false;
        }
    }
}
