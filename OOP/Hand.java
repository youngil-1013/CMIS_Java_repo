import java.util.*;
public class Hand
{
    private List<Card> cards;

    public Hand(){
        cards = new ArrayList<Card>();
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public int getValue(){
        int returnVal = 0;
        for (Card card : cards){
            int val = card.getRank();
            if (1 <= val && val <= 9){
                returnVal += (val + 1);
            }
            else if (val > 9){
                returnVal += 10;
            }
            else{
                returnVal += 11;
            }
        }
        if (returnVal == 22){
            returnVal = 12;
        }
        return returnVal;
    }

    public String toString(){
        String out = "";
        for(Card card : cards){
            out += card.toString() + " ";
        }
        return out;
    }
}