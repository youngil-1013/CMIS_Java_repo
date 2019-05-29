import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AddLaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserROF extends Button
{
    private boolean upgradd = false;
    public LaserROF(int price){
        super("Increase Laser ROF:\n$", price);
    } 

    public void act(){
        super.act();
        go();
    }

    public void go(){
        if (!upgradd){
            Upgrade upgrade = (Upgrade) getWorld();
            upgrade.getPlayer().setLaserROF(upgrade.getPlayer().getLaserROF() + 1);
            upgrade.getPlayer().setPrice(3);
            upgradd = true;
        }
    }
}
