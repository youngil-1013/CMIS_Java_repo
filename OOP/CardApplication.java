import java.util.*;
public class CardApplication{
    public static void main (String [] args){
        Game game = new Game();
        game.addHuman();
        while (game.broke() == 0){
            game.setupPlayer();
            game.playRound();
            game.summary();
        }
    }
}
