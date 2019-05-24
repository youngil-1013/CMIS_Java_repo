import greenfoot.*;

public class Bullet extends Actor implements Shootable
{   
    private int rate;
    private int damage = 5;

    public Bullet(){
        GreenfootImage image = getImage();
        image.scale(10,10);
        setImage(image);
    }

    public void border(){
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }

    public void act(){
        move(20);
        border();
    }
    
    public int getDamage(){
        return damage;
    }
    
    public void incDamage(int amount){
        damage += amount;
    }
}
