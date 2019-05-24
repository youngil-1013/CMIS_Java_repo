import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Upgrade extends World
{
    private Player player;
    public Upgrade(Player player){
        super(1000, 600, 1); 
        this.player = player;
        addObject(new BulletDmg(), 150, 400);
        addObject(new AddBullet(), 500, 400);
        addObject(new LaserDmg(), 150, 500);
        addObject(new AddLaser(), 500, 500);
        addObject(new Next(), 850, 500);
    }
    
    public Player getPlayer(){
        return player;
    }
    
    public void act(){
        showText(String.format("$%d",player.getMoney()), 100, 100);
    }
}
