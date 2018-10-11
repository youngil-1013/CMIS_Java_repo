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
    public void behave()
    {
        boolean upAndDown = false;

        {
            if (isClearRight() == true)
                right();
            if (upAndDown == false && isClearRight() == false)
            {
                if (isClearUp() == true)
                {
                    up();
                }
                if (isClearDown() == true)
                {
                    down();
                }
                if (isClearDown() == false && isClearUp() == false)
                    upAndDown = true;
            }
            if (upAndDown == true)
            {
                left();
                if (isClearDown() == true || isClearUp() == true)
                    upAndDown = false;
            }
        }
    }
}
