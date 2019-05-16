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
    private MyWorld main;
    private ArrayList<Entity> entities;
    public Battle(MyWorld main){
        super(600, 400, 1);
        this.main = main;
        entities = main.getEntities(0);
        showText("Enemy Stats:\n" + entities.get(1), 400, 80);
        showText("Player Stats:\n"+ entities.get(0), 100, 80);
    }
}
