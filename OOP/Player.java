public class Player
{
    private String name;
    private int chips;
    private int bet;
    private Hand hand;
    private int playerNum = 0;
    public Player()
    {
        this.name = "player" + playerNum;
        this.chips = 1000;
        this.bet = 10;
    }
    
    public Player(String name)
    {
        this.name = name;
        this.chips = 1000;
        this.bet = 10;
    }
    
    public void addCard (Card card)
    {
        hand.addCard(card);
    }
}
