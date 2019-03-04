public class CardApplication
{
    public static void main (String [] args)
    {
        Card[] deck = new Card[52];
        Card dCard = new Card();
        int place = 0;
        for (int tmpSuit = 0; tmpSuit < 4; tmpSuit ++)
        {
            for (int tmpRank = 0;  tmpRank < 13; tmpRank ++)
            {
                Card tmpCard = new Card(tmpSuit,tmpRank);
                deck[place] = tmpCard;
                place ++;
            }
        }
        for (int dPlace = 0; dPlace < 52; dPlace ++)
        {
            System.out.println(deck[dPlace]);
        }
    }
}
