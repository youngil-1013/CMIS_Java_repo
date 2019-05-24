import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Next here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Next extends Button
{
    public Next(){
        super("Move onto next Level", 0);
    }

    public void out(){
        getWorld().showText("Move onto next Level", getX(), getY());
    }

    public void act(){
        out();
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Main(((Upgrade)getWorld()).getPlayer()));
        }
    }
}
