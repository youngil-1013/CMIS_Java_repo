import java.util.Scanner;
public class ClockApplication
{
    public static void main (String[] arg)
    {
        Clock kitchenClock = new Clock();
        System.out.println(kitchenClock.toString());
        Scanner input = new Scanner(System.in);
        System.out.println("Hour?");
        int userHr = input.nextInt();
        System.out.println("Minute?");
        int userMin = input.nextInt();
        System.out.println("Second?");
        int userSec = input.nextInt();
        Clock bedroomClock = new Clock(userHr, userMin, userSec);
        System.out.println(bedroomClock.toString());
    }
}
