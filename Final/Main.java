import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Main extends World
{
    public Main()
    {    
        // Create a new world with 700x700 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,331,337);
        player.setLocation(74,288);
        Enemy enemy = new Enemy();
        addObject(enemy,294,226);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,356,410);
    }
}
