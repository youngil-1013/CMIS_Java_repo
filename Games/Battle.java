import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Battle1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Battle extends World
{
    private ArrayList<Entity> entities = MyWorld.getEntities(0);
    /**
     * Constructor for objects of class Battle1.
     * 
     */

    public Battle(MyWorld main){
        super(600, 400, 1);
        
        showText("Enemy Stats:", 400, 40);
        showText("Player Stats:", 100, 40);
    }
}
