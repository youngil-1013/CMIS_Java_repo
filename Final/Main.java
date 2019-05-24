import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class Main extends World
{
    private Player player = new Player();
    private int level = 1;
    public Main(){    
        super(1000, 600, 1); 
        prepare();
        act();
    }

    public Main(Player player){
        super(1000, 600, 1); 
        this.player = player;
        prepare();
        act();
    }

    public void act(){
        showMoney();
        check();
    }

    public void check(){
        if (getObjects(Enemy.class).isEmpty()){
            Greenfoot.setWorld(new Upgrade(player));
        }
    }

    private void prepare()
    {
        addObject(player,331,337);
        player.setLocation(112,288);
        Earth earth = new Earth();
        addObject(earth,12,290);
        earth.setLocation(10,300);
        earth.setLocation(2,303);
        addEnemy();
        showMoney();
    }

    private void addEnemy(){
        for (int idx = 0; idx <= level; idx ++){
            Enemy enemy = new Enemy();
            int rdX = (int) (Math.random() * 100 + 900);
            int rdY = (int) (Math.random() * 600);
            addObject(enemy,rdX,rdY);
        }
    }

    public void showMoney(){
        showText(String.format("$%d",player.getMoney()), 100, 100);
    }

    public Player getPlayer(){
        return player;
    }
}
