import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BulletDmg extends Button // idx 0
{
    private boolean upgradem = false;
    public BulletDmg(int price){
        super("Increase Bullet Damage:\n$", price);
    }

    public void act(){
        super.act();
        go();
    }

    public void go(){
        if (!upgradem){
            Upgrade upgrade = (Upgrade) getWorld();
            upgrade.getPlayer().setBulletDmg(upgrade.getPlayer().getBulletDmg() + 2);
            upgrade.getPlayer().setPrice(0);
            upgradem = true;
        }
    }
}
