import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LaserROF extends Button
{
    private Player player;
    public LaserROF(int price){
        super("Increase Laser ROF:\n$", price);
    } 

    public void act(){
        super.act();
    }

    public void go(){
        Upgrade upgrade = (Upgrade) getWorld();
        upgrade.getPlayer().setLaserROF(upgrade.getPlayer().getLaserROF() + 1);
        upgrade.getPlayer().setPrice(3);
    }
}
