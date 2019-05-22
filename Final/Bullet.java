import greenfoot.*;
/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor 
{   
    public Bullet(){

    }

    public void fire(int x, int y){
        getWorld().showText("L", x, y);
    }
}
