public class Player implements Changeable
{
    private int position = 0;
    private int level = 1;
    
    public void change(int value){
        position += value;
    }

    public int getPosition(){
        return position;
    }
}
