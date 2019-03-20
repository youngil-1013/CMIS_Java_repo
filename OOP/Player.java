public class Player
{
    private String name;
    private int chips;
    private int bet;
    private Hand hand;
    private int playerNum = 0;
    public Player(){
        this.name = "player" + playerNum;
        this.chips = 100;
        this.bet = 10;
    }

    public Player(String name){
        this.name = name;
        this.chips = 100;
        this.bet = 10;
    }

    public Player(String name, int chips){
        this.name = name;
        this.chips = chips;
        this.bet = 0;
    }

    public void setHand(Hand hand){
        this.hand = hand;
    }

    public int getScore(){
        return hand.getValue();
    }

    public int chips(){
        return chips;
    }

    public void setChips(int chips){
        this.chips = chips;
    }

    public Hand hand(){
        return hand;
    }
    
    public Card hand(int n){
        return hand.get(0);
    }

    public void setBet(int bet){
        this.bet = bet;
    }
    
    public int bet(){
        return bet;
    }

    public String name(){
        return name;
    }

    public String toString(){
        String out = "";
        out += name + " ";
        out += hand.toString();
        return out;
    }
}
