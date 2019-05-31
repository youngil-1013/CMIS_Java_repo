
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor
{
    private int health = 9;
    private int money = 60;
    private Bullet bullet;
    private Laser laser;
    public Enemy(){
        GreenfootImage image = getImage();
        image.scale(50,30);
        setImage(image);
    }

    public void act() 
    {
        move(-1);

        if (((Main)getWorld()).getPlayer().getLevel() > 3){
            money = 30;
        }else if(((Main)getWorld()).getPlayer().getLevel() > 5){
            money = 15;
        }

        if (intersectB()){
            damageB();
        }

        if (intersectL()){
            damageL();
        }

        if (health <= 0){
            Main world = (Main) getWorld();
            Player player = world.getPlayer();
            player.addMoney(money);
            getWorld().removeObject(this);
        }
    }    

    public void damageB(){
        bullet = (Bullet) getOneIntersectingObject(Bullet.class);
        if (intersects(bullet)){
            health -= bullet.getDamage();
            getWorld().removeObject(bullet);
        }
    }

    public void damageL(){
        laser = (Laser) getOneIntersectingObject(Laser.class);
        if (intersects(laser)){
            health -= laser.getDamage();
        }
    }

    public boolean intersectB(){
        if(getOneIntersectingObject(Bullet.class) != null){
            return true;
        }else{
            return false;
        }
    }

    public boolean intersectL(){
        if(getOneIntersectingObject(Laser.class) != null){
            return true;
        }else{
            return false;
        }
    }
}
