import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Youngil extends Robot
{
    public Youngil(){
        super(Color.PINK);
    }

    public void init(){

    }

    /**
     * What your robot can do:
     * right() => move 1 to the right
     * left() => move 1 to the left
     * up() => move 1 up
     * down() => move 1 down
     * isClearRight() => true means no block to the right
     * isClearLeft() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     */
    public void behave(){
        String where;
        int time = 0;
        while (isClearRight() == false)
        {
            if (time == 0)
            {
                if (isClearUp() == false)
                {
                    down();
                    where = "down";
                }
                else if (isClearDown() == false)
                {
                    up();
                    where = "up";
                }
                else if (isClearUp() == false && isClearDown() == false)
                {
                    left();
                    where = "left";
                }
            }
        }
        right();
    }
}
