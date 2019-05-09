import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Rocket extends Actor
{
    public void act() 
    {
        if (Greenfoot.isKeyDown("left")){
            turn(-5);
        }
        else if (Greenfoot.isKeyDown("right")){
            turn(5);
        }
        else if (Greenfoot.isKeyDown("down")){
            move(-2);
        }
        else if (Greenfoot.isKeyDown("up")){
            move(3);
        }
        Actor Point;

        Point = getOneObjectAtOffset(0,0,Point.class);

        if(Point != null){
            World world;
            world = getWorld();
            world.removeObject(Point);
        }
    }
}