import java.util.*;
public class Game{
    public static void main(String[] argv){
        System.out.println("==========0==========");
        Bird bird = new Bird(5, 5, "red");

        System.out.println(bird);
        System.out.println("==========1==========");

        bird.move(1, 0);
        System.out.println(bird);
        System.out.println("==========2==========");

        bird.fly(10, 25);
        System.out.println(bird);
        System.out.println("==========3==========");

        bird.fly(-10, -25);
        System.out.println(bird);
        System.out.println("==========4==========");

        List<String> food = new ArrayList<String>();
        food.add("worms");
        food.add("fish");
        food.add("pineapple");
        food.add("seeds");

        for(String item : food){
            boolean result = bird.eat(item);
            if(result){
                System.out.format("Mmmmm...%s.\n", item);
            }else{
                System.out.format("%s?!?! Yuck!\n", item);
            }
        }
        System.out.println("==========5==========");
        System.out.println(bird.getGraphic());
        System.out.println(bird.getColor());
        System.out.println("==========6==========");
    }
}