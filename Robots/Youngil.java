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
     * 4: currentHeight;
     * 5: right/left (0/1)
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
        else if (getData(0) == 3)
        {
            if (getData (5) == 0 && getData(3) < getData(1))//direction we want is right(left edge rn)
            {
                right();
                setData(3, getData(3) + 1);//adds 1 to currentWidth
            }
            else if (getData(5) == 1 && getData(3) < getData(1))//direction we want is left(right edge rn)
            {
                left();
                setData(3, getData(3) + 1);//adds 1 to currentWidth
            }
            else if ((getData(5) == 0 && !isClearRight()))//direction we are going is right
            {
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
            else if ((getData(5) == 1 && !isClearLeft()))//direction we are going is left
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
        else if (getData(0) == 4)
        {
            up();
            setData(0, 3);
        }
        else if (getData(0) == 5)
        {
            System.out.print("fuond");
            setData(0,66);
        }
        
    }
}

