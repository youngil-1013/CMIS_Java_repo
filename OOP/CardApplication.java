public class CardApplication
{
    public static void main (String [] args)
    {
        Deck player1Deck = new Deck(2);
        while (player1Deck.nCards() > 0)
        {
            Card tempCard = new Card();
            tempCard = player1Deck.draw();
            System.out.print(tempCard + ",");
        }
    }
}
