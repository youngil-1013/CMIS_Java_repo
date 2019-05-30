import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World
{

    /**
     * Constructor for objects of class End.
     * 
     */
    public End()
    {    
        super(1000, 600, 1);
        showText("YOU SUCK AND EARTH GOT DESTORYED\nRETRY? press R", 500, 300);
    }

    public void act(){
        retry();
    }

    public void retry(){
        if(Greenfoot.isKeyDown("r")){
            Main main = new Main();
            Greenfoot.setWorld(main);
        }
    }
}
