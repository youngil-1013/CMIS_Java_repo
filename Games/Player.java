import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player(){
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
    }

    public void act() 
    {
        move();
        Greenfoot.delay(8);
    }

    public void move(){
        if (Greenfoot.isKeyDown("up") && getY() >= 25){
            setLocation(getX(), getY() - 25);
        }else if (Greenfoot.isKeyDown("down") && getY() < getWorld().getHeight() - 25){
            setLocation(getX(), getY() + 25);
        }else if (Greenfoot.isKeyDown("left") && getX() >= 50){
            setLocation(getX() - 25, getY());
        }else if (Greenfoot.isKeyDown("right") && getX() < getWorld().getWidth() - 25){
            setLocation(getX() + 25, getY());
        }
    }
    
    public void detect(){
        Actor Enemy;
        Enemy = getOneObjectAtOffset(0,0,Enemy.class);
        
        if(Enemy != null){
            World world;
            world = getWorld();
            world.removeObject(Enemy);
        }
        
    }
}
