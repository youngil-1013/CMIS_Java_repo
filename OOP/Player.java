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
    
    public void setHand(Hand hand)
    {
        this.hand = hand;
    }
    
    public int getScore()
    {
        return hand.getValue();
    }
    
    public String toString()
    {
        String out = "";
        out += name + " ";
        out += hand.toString();
        return out;
    }
}
