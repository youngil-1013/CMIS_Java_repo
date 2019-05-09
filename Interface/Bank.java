public class Bank implements Purchaseable
{
    private int money = 1000;
    public int getMoney(){
        return money;
    }

    public void add(int add){
        money += add;
    }
}
