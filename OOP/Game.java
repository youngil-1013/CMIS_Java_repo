import java.util.*;
public class Game
{
    ArrayList<Player> players = new ArrayList<Player>();
    private Deck deck;
    private Player dealer;
    private Player tmpplayer;
    
    public Game()
    {
        dealer = new Player("dealer");
        deck = new Deck(1);
    }
    
    public void addPlayer(String name)
    {
        tmpplayer = new Player(name);
        players.add(tmpplayer);
    }
    
    public void setup()
    {
        deck.shuffle();
        for (int person = 0; person < players.size(); person ++)
        {
            Hand tmp
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
}
