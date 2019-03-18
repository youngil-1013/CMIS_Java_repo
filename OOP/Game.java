import java.util.*;
public class Game
{
    ArrayList<Player> players = new ArrayList<Player>();
    private Deck deck;
    private Player player;

    public Game()
    {
        player = new Player("dealer");
        players.add(player);
        deck = new Deck(1);
    }

    public void addPlayer(String name)
    {
        player = new Player(name);
        players.add(player);
    }

    public void setup()
    {
        deck.shuffle();
        for (int player = 0; player < players.size(); player ++)
        {
            Hand tmphand = new Hand();
            for(int num = 0; num < 2; num ++)
            {
                Card tmpcard = deck.draw();
                tmphand.addCard(tmpcard);
            }
            Player tmpplayer = players.get(player);
            tmpplayer.setHand(tmphand);
        }
        System.out.println(players);
    }
    
    public void playRound()
    {
        int[] winner = new int[players.size()];
        int dealerVal;
        int tmpPlayerVal;
        for (int player = 0; player < players.size(); player ++)
        {
            if (player == 0)
            {
                Player dealer = players.get(0);
                dealerVal = dealer.getScore();
            }
            else
            {
                Player tmpplayer = players.get(player);
                tmpPlayer 
            }
        }
    }
}

/*
int winner = 0;
int score = 0;
for (int player = 0; player < numPlayer; player ++)
{
Hand tmpHand = new Hand();
tmpHand = hands.get(player);
if (tmpHand.getValue() >= score && winner == 0)
{
winner = player;
score = tmpHand.getValue();
}
else if (tmpHand.getValue() > score)
{
winner = player;
score = tmpHand.getValue();
}
}
 */

