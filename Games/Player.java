import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Entity
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Player(){
        super();
    }
    
    public Player(int level, int exp, int health, int ad){
        super(level, exp, health, ad);
    }

    public void act(){
        move();
        detect();
        Greenfoot.delay(6);
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
            Battle battle = new Battle();
            Greenfoot.setWorld(battle);
        }
    }
    
    public String toString(){
        String out = "";
        out += "level: " + level + "\n";
        return out;
    }
}
