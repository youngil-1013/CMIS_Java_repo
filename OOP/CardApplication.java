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
        
        Hand player1 = new Hand();
        while (player1.getValue() < 21)
        {
            player1.addCard(deck[(int)(Math.random()*52)]);
        }
        System.out.println(player1);
        int player1Score = player1.getValue();
        System.out.println(player1Score);
    }
}
