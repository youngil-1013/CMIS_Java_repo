import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserDmg here // idx 2
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserDmg extends Button
{
    public LaserDmg(int price){
        super("Increase Laser Damage:\n$", price);
    }

    public void act(){
        super.act();
    }

    public void go(){
        Upgrade upgrade = (Upgrade) getWorld();
        upgrade.getPlayer().setLaserDmg(upgrade.getPlayer().getLaserDmg() + 1);
        upgrade.getPlayer().setPrice(2);
    }

}
