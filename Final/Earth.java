import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Earth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Earth extends Actor
{
    /**
     * Act - do whatever the Earth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(intersect()){
            Greenfoot.setWorld(new End());
        }
    }

    public boolean intersect(){
        if(getOneIntersectingObject(Enemy.class) != null){
            return true;
        }else{
            return false;
        }
    }
}