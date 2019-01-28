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
     * 0: State (0 = Corner, 1 = foundCorner/nullWidth, 2 = foundWidth/nullHeight,
     * 3 = move left/right, 4 = move up, 5 = found corner of Box)
     * 1: width;
     * 2: height;
     * 3: currentWidth;
     * 4: movementOnSideOfBox (0 = up, 1 = left, 2 = bottom, 3 = right)
     * 5: right/left for currentWidth(0/1)
     * 6: current index of side of box (0-9);
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
        else if (getData(0) == 3)
        {
            if (getData (5) == 0 && getData(3) < getData(1))//direction we want is right(left edge rn)
            {
                setData(3, getData(3) + 1);//adds 1 to currentWidth
                right();
                if (!isClearRight()){
                    if (getData(3) != getData(1))
                    {
                        setData(0, 5);
                    }
                    else
                    {
                        setData(5, 1);//revert the direction we want to left
                        setData(3, 0);//reset currentWidth;
                        setData(0, 4);//move up 1
                    }
                }
            }
            else if (getData(5) == 1 && getData(3) < getData(1))//direction we want is left(right edge rn)
            {
                setData(3, getData(3) + 1);//adds 1 to currentWidth
                left();
                if(!isClearLeft())
                {
                    if (getData(3) != getData(1))
                    {
                        setData(0, 5);
                    }
                    else if (getData(3) == getData(1))
                    { 
                        setData(5, 0);//revert the direction we want to right
                        setData(3, 0);//reset currentWidth
                        setData(0, 4);//move up 1
                    }
                }
            }
        }
        else if (getData(0) == 4)
        {
            up();
            setData(0, 3);
        }
        else if (getData(0) == 5)
        {
            if (getData(4) == 0)//going up
            {
                if (getData(6) <= 10)//check if inside width index
                {
                    up();
                    setData(6, getData(6) + 1);
                    if (isClearRight() && isClearLeft())
                    {
                        System.out.println("Y");
                        setData(0, 100);
                    }
                }
                else
                {
                    if (getData(5) == 0)//if we start from right bottom
                    {
                        setData(4, 3);//up --> right
                        setData(6, 0);
                    }
                    else
                    {
                        setData(4, 1);//up --> left
                        setData(6, 0);
                    }
                }
            }
            else if (getData(4) == 1)//going left
            {
                if (getData(6) <= 11)//check if inside width index
                {
                    left();
                    setData(6, getData(6) + 1);
                    if (isClearUp() && isClearDown())
                    {
                        System.out.println("Y");
                        setData(0, 100);
                    }
                }
                else
                {
                    setData(6, 0);
                    setData(4, 2);
                }
            }
            else if (getData(4) == 3)//going right
            {
                if (getData(6) <= 11)//check if inside width index
                {
                    right();
                    setData(6, getData(6) + 1);
                    if (isClearUp() && isClearDown())
                    {
                        System.out.println("Y");
                        setData(0, 100);
                    }
                }
                else
                {
                    setData(6, 0);
                    setData(4, 2);
                }
            }
            else if (getData(4) == 2)//going down
            {
                if (getData(6) <= 11)//check if inside width index
                {
                    down();
                    setData(6, getData(6) + 1);
                    if (isClearUp() && isClearDown())
                    {
                        System.out.println("Y");
                        setData(0, 100);
                    }
                }
                else
                {
                    if (getData(5) == 0)//if we start from right bottom
                    {
                        setData(4, 1);//down --> right
                        setData(6, 0);
                    }
                    else
                    {
                        setData(4, 3);//down --> left
                        setData(6, 0);
                    }
                }
            }
        }
    }
}