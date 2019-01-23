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
     * setData(idx, int)
     * getData(idx)
     * 0: State (0 = Corner, 1 = foundCorner/nullWidth, 2 = foundWidth/nullHeight)
     * 1: width;
     * 2: height;
     * 3
     * 4
     * 5
     * 6
     * 7
     * 8
     * 9
     */
    public void behave()
    {
        if (getData(0) == 0)
        {
            if (isClearUp())
            {
                up();
            }
            else if (isClearRight())
            {
                right();
            }
            else
            {
                setData(0,1);
            }
        }
        else if (getData(0) == 1)
        {
            if (!isClearLeft())
            {
                setData(0,2);
            }
            else
            {
                left();
                setData(1, getData(1)+1);
            }
        }
        else if (getData(0) == 2)
        {
            if (!isClearDown())
            {
                setData(0,3);
            }
            else
            {
                down();
                setData(2, getData(2)+1);
            }
        }
        else
        {
            //System.out.println(getData(1));
            System.out.println(getData(2));
        }
    }
}
