import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AddBullet here// idx 1
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletROF extends Button
{
    private boolean upgrade1 = false;
    public BulletROF(int price){
        super("Increase Bullet ROF:\n$", price);
    } 
    
    public void act(){
        super.act();;
        go();
    }

    public void go(){
        if (!upgrade1){
            Upgrade upgrade = (Upgrade) getWorld();
            upgrade.getPlayer().setBulletROF(upgrade.getPlayer().getBulletROF() + 1);
            upgrade.getPlayer().setPrice(1);
            upgrade1 = true;
        }
    }
}
