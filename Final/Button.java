import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private String function;

    public Button(String function){
        this.function = function;
        GreenfootImage image = getImage();
        image.scale(300,70);
        setImage(image);
    }

    public void out(){
        getWorld().showText(function, getX(), getY());
    }

    public void act(){
        out();
    }    
}
