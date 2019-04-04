import java.util.*;
public class TVApp{
    public static void main(String[] args){
        ArrayList<Television> tvs = new ArrayList<Television>();
        Television tv = new Television("HD Bronze", 59.99);
        tvs.add(tv);
        DLP dlp = new DLP("Silver", 99.99);
        tvs.add(dlp);
        LCD lcd = new LCD("Gold", 199.99);
        tvs.add(lcd);
        LED led = new LED("Platinum", 399.99);
        tvs.add(led);
        Plasma plas = new Plasma("Sapphire", 499.99);
        tvs.add(plas);
        for (Television tel : tvs){
            System.out.println(tel);
        }
    }
}
