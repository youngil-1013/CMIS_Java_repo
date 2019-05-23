import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Main extends World
{
    public Main()
    {    
        // Create a new world with 700x700 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }

    private Player player = new Player();

    private void prepare()
    {
        addObject(player,331,337);
        player.setLocation(112,288);
        Enemy enemy = new Enemy();
        addObject(enemy,294,226);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,356,410);
        enemy2.setLocation(540,445);
        enemy.setLocation(549,225);
        Earth earth = new Earth();
        addObject(earth,12,290);
        earth.setLocation(10,300);
        earth.setLocation(2,303);
        enemy.setLocation(939,151);
        enemy2.setLocation(904,463);
    }

    public Player getPlayer(){
        return player;
    }
}
