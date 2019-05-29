import greenfoot.*;

public class Bullet extends Actor implements Shootable
{   
    int damage;

    public Bullet(int dmg){
        damage = dmg;
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
