import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BulletROF extends Button
{
    public BulletROF(int price){
        super("Increase Bullet ROF:\n$", price);
    } 

    public void act(){
        super.act();
    }

    public void go(){
        Upgrade upgrade = (Upgrade) getWorld();
        upgrade.getPlayer().setBulletROF(upgrade.getPlayer().getBulletROF() + 1);
        upgrade.getPlayer().setPrice(1);
    }
}
