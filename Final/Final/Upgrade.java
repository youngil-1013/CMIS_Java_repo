import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Upgrade extends World
{
    private Player player;
    public Upgrade(Player player){
        super(1000, 600, 1); 
        this.player = player;
        addObject(new BulletDmg(player.getPrice(0)), 150, 400);
        addObject(new BulletROF(player.getPrice(1)), 500, 400);
        addObject(new LaserDmg(player.getPrice(2)), 150, 500);
        addObject(new LaserROF(player.getPrice(3)), 500, 500);
        addObject(new Next(), 850, 500);
        showText("WELCOME TO THE SHOP!\n\n*ROF stands for rate of fire\n**You can increase laser damage only if \nyou have already purchased the first laser ROF", 500, 100);
    }
    
    public Player getPlayer(){
        return player;
    }
    
    public void act(){
        showText(String.format("$%d",player.getMoney()), 100, 100);
    }
}
