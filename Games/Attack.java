import greenfoot.*;
/**
 * Write a description of class Fight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attack extends Button{


    public Attack(Entity enemy, Entity player){
        this.enemy = enemy;
        this.player = player;
    }

    public int compute(Entity target, Entity other){
        return target.getHealth() - other.getAD();
    }

    public void act(){
        showText("attack: 1", 200, 400);
    }
}