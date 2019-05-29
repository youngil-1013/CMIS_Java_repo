import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private int time = 100;
    private int speed = 3;
    private int money = 0;
    private int bulletROF = 1;
    private int laserROF = 0;

    public Player(){
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
    }

    public void act(){
        move();
        for (int n = bulletROF; n > 0; n--){
            shootB();
        }
        if(intersect()){
            Greenfoot.setWorld(new Death());
        }
    }

    public int getTime(){
        return time;
    }

    public int getSpeed(){
        return speed;
    }

    public int getMoney(){
        return money;
    }
    
    public int getBulletROF(){
        return bulletROF;
    }
    
    public int getLaserROF(){
        return laserROF;
    }

    public void setTime(int time){
        this.time = time;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void addMoney(int amount){
        this.money += amount;
    }
    
    public void setBulletROF(int rof){
        this.bulletROF = rof;
    }	
    
    public void setLaserROF(int rof){
        this.laserROF = rof;
    }

    public void move(){
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(),getY() - speed);
        }else if(Greenfoot.isKeyDown("s")){
            setLocation(getX(),getY() + speed);
        }else if(Greenfoot.isKeyDown("a")){
            setLocation(getX() - speed,getY());
        }else if(Greenfoot.isKeyDown("d")){
            setLocation(getX() + speed,getY());
        }
        if(getX() <= 100){
            setLocation(getX() + speed,getY());
        }
    }

    public void shootB(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(time <= 0 && mouse != null){
            Bullet bullet = new Bullet();
            int x = mouse.getX();
            int y = mouse.getY();
            getWorld().addObject(bullet, this.getX(), this.getY());
            bullet.turnTowards(x, y);
            this.time = 100;
        }else{
            time --;
        }
    }

    public boolean intersect(){
        if(getOneIntersectingObject(Enemy.class) != null){
            return true;
        }else{
            return false;
        }
    }
}
