import java.util.*;
public class CardApplication
{
    public static void main (String [] args)
    {
        Deck deck = new Deck(1);
        deck.shuffle();

        ArrayList<Hand> hands = new ArrayList<Hand>();

        int numPlayer = 3;
        for (int player = 0; player < numPlayer; player ++)
        {
            Hand tmpHand = new Hand();
            for (int num = 0; num < 2; num ++)
            {
                tmpHand.addCard(deck.draw());
            }
            hands.add(tmpHand);
        }
        System.out.println(hands);

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
        System.out.println(winner);
    }
}
