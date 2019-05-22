import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int time;
    public Player(){
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
    }

    public void act(){
        move();
        shoot();
    }

    public void move(){
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(),getY() - 10);
        }else if(Greenfoot.isKeyDown("s")){
            setLocation(getX(),getY() + 10);
        }else if(Greenfoot.isKeyDown("a")){
            setLocation(getX() - 10,getY());
        }else if(Greenfoot.isKeyDown("d")){
            setLocation(getX() + 10,getY());
        }
    }

    public void shoot(){
        if(Greenfoot.mouseClicked(getWorld())){
            Bullet bullet = new Bullet();
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int x = mouse.getX();
            int y = mouse.getY();
            getWorld().addObject(bullet, this.getX(), this.getY());
            bullet.turnTowards(x, y);
        }
    }
}
