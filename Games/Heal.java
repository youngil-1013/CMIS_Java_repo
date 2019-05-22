import greenfoot.*;
/**
 * Write a description of class Run here.
 * 
 * @author Anna 
 * @version (a version number or a date)
 */
public class Heal extends Button{
    public Heal(Entity player){
        super.player = player; 
    } 

    public int compute(Entity player, Entity enemy){
        return  player.getHealth() + (int)(player.getAD()*0.5); 
    }

    public void act(){
        showtext("heal: 1", 100, 100); 
    }
}
