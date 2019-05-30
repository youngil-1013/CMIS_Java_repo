import greenfoot.*;

public class Bullet extends Actor implements Shootable
{   
    private int damage;

    public Bullet(){
    }

    public Bullet(int dmg){
        damage = dmg;
        GreenfootImage image = getImage();
        image.scale(30,30);
        setImage(image);
    }

    public void border(){
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }

    public void act(){
        move(5);
        border();
    }

    public int getDamage(){
        return damage;
    }

    public void incDamage(int amount){
        damage += amount;
    }
}
