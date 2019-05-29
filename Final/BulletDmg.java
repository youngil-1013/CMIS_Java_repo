import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BulletDmg extends Button
{
    private int price = 200;

    public BulletDmg(){
        super("Increase Bullet Damage:\n$", 200);
    }

    public void go(){
        Upgrade upgrade = (Upgrade) getWorld();
        upgrade,
        upgrade.getPlayer().setBulletROF(upgrade.getPlayer().getBulletROF() + 1);
    }
}
