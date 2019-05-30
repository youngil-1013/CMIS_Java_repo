import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beginning here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Beginning.
     * 
     */
    public Title()
    {    
        super(600, 400, 1);
        showText("Press R to start", 300, 100);
        showText("A VERY CAPITALIST GAME/nUse WASD key to move and I didn't make an\nend gamescene so play until you die or get bored.", 300, 200);

    }

    public void act(){
        if(Greenfoot.isKeyDown("r")){
            Main main = new Main();
            Greenfoot.setWorld(main);
        }
    }
}
