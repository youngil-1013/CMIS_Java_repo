import java.util.*;
public class CardApplication
{
    public static void main (String [] args)
    {
        Game game = new Game();
        game.addHuman();
        game.setup();
        game.playRound();
        game.summary();        
    }
}
