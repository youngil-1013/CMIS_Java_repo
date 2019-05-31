import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private int time = 100;
    private int speed = 3;
    private int money = 300;
    private int bulletROF = 1;
    private int laserROF = 0;
    private int bulletDmg = 3;
    private int laserDmg = 1;
    private int [] prices = new int[] {100, 300, 300, 600};//bDmg, bRate, lDmg, lRate
    private int level = 1;
    private boolean lasertime = false;

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

        for (int n = laserROF; n > 0; n--){
            shootL();
        }

        if(intersect()){
            Greenfoot.setWorld(new Death());
        }
        
        World world = getWorld();
        if (world instanceof Main){
            ((Main) world).setLevel(level);
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

    public int getBulletDmg(){
        return bulletDmg;
    }

    public int getLaserDmg(){
        return laserDmg;
    }

    public int getPrice(int idx){
        return prices[idx];
    }

    public int getLevel(){
        return level;
    }

    public void incLevel(){
        level++;
    }

    public void setPrice(int idx){
        prices[idx] = prices[idx] + 100;
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

    public void setBulletDmg(int dmg){
        this.bulletDmg = dmg;
    }

    public void setLaserDmg(int dmg){
        this.laserDmg = dmg;
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
            Bullet bullet = new Bullet(bulletDmg);

            int x = mouse.getX();
            int y = mouse.getY();
            getWorld().addObject(bullet, this.getX(), this.getY());

            bullet.turnTowards(x, y);
            this.time = 100;
        }else{
            time --;
        }
    }

    public void shootL(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(time <= 0 && mouse != null){
            if (laserROF > 0 && lasertime){
                Laser laser = new Laser(laserDmg);
                int x = mouse.getX();
                int y = mouse.getY();
                getWorld().addObject(laser, this.getX(), this.getY() - 10);
                laser.turnTowards(x, y);
                this.time = 100;
                lasertime = false;
            }else {
                lasertime = true;
            }
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
