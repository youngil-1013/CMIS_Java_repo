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
        if(confirm(entities)){
            fight();
        }
    }

    public boolean confirm(ArrayList<Entity> entities){
        entities = main.getEntities(0);
        showText("Enemy Stats:\n" + entities.get(1), 500, 80);
        showText("Player Stats:\n"+ entities.get(0), 100, 80);
        showText("Fight or Run?\n <-      ->", 300, 200);
        if (Greenfoot.isKeyDown("left")){
            return true;
        }else{
            return false;
        }
    }

    public void fight(){
        showText("ddddddddddd", 400, 400);
        showText("ddddddddddd", 100, 400);
        showText("ddddddddddd", 400, 100);
    }
}
