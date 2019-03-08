import java.util.*;
public class Deck
{
    private List<Card> cards;

    public Deck(int nDecks){
        cards = new ArrayList<Card>();
        for (int num = 0; num < nDecks; num ++)
        {
            for (int tmpSuit = 0; tmpSuit < 4; tmpSuit ++)
            {
                for (int tmpRank = 0;  tmpRank < 13; tmpRank ++)
                {
                    Card tmpCard = new Card(tmpSuit,tmpRank);
                    cards.add(tmpCard);
                }
            }
        }
    }

    public int nCards(){
        return cards.size();
    }

    public Card draw(){
        int last = cards.size();
        return cards.remove(last - 1);
    }

    public void shuffle(){
        int idxShuffled = 0;
        while (cards.size() > 0)
        {
            int idxCards = (int)(Math.random() * cards.size());
            Card tmpCard = cards.get(idxCards);
            cards.set(idxShuffled);
        }
    }

    public String toString(){
        String out = "";
        for(Card card : cards){
            out += card.toString() + " ";
        }
        return out;
    }
}
