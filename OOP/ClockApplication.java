import javax.swing.JOptionPane;
public class ClockApplication
{
    public static void main (String[] arg)
    {
        Clock kitchenClock = new Clock();
        System.out.println(kitchenClock.toString());
        int userHr = Integer.parseInt(JOptionPane.showInputDialog("Hour:"));
        int userMin = Integer.parseInt(JOptionPane.showInputDialog("Minute:"));
        int userSec = Integer.parseInt(JOptionPane.showInputDialog("Second:"));
        Clock bedroonClock = new Clock(userHr, userMin, userSec);
    }
}
