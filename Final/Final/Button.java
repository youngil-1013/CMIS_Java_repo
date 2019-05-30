import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
    private String function;
    private int price;

    public Button(String function, int price){
        this.function = function;
        this.price = price;
        GreenfootImage image = getImage();
        image.scale(300,70);
        setImage(image);
    }

    public int getPrice(){
        return price;
    }

    public void purchase(){
        if (price <= ((Upgrade)getWorld()).getPlayer().getMoney()){
            ((Upgrade)getWorld()).getPlayer().addMoney(-price);
        }
    }

    public void go(){
    }

    public void act(){
        out();
        if (Greenfoot.mouseClicked(this) && (price <= ((Upgrade)getWorld()).getPlayer().getMoney())){
            purchase();
            go();
        }
    }

    public void out(){
        String out = function;
        out += getPrice();
        getWorld().showText(out, getX(), getY());
    }
}
