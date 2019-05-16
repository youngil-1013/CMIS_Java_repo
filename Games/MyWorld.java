import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Player player;
    private ArrayList<Enemy> enemies = new ArrayList <Enemy>();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        player = new Player(this, 1, 0, 5, 2);
        addObject(player, 250, 350);
        Enemy enemy1 = new Enemy(1, 2, 3, 2);
        enemies.add(enemy1); //0
        addObject(enemy1, 400, 50);
        player.setLocation(265,336);
        player.setLocation(351,48);
    }

    public ArrayList<Entity> getEntities(int enemyNum){
        ArrayList<Entity> out = new ArrayList<Entity>();
        out.add(0, player);
        out.add(1, enemies.get(enemyNum));
        return out;
    }
    //gets (player,enemy)
}
