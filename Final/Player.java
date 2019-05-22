import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    Player(){
    }

    public void act(){
        
        shoot();
    }

    public void shoot(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int x = mouse.getX();
        int y = mouse.getY();
        Bullet bullet = new Bullet();
        
    }
}
