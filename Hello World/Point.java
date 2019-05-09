import greenfoot.*;

public class Point extends Actor
{
    /**
     * Act - do whatever the POint wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(Greenfoot.getRandomNumber(10));
        turn(4 - Greenfoot.getRandomNumber(10));
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5){
            turn(180);
        }
        if (getY() <= 5 || getX() >= getWorld().getHeight() - 5){
            turn(180);
        }
    }
}
