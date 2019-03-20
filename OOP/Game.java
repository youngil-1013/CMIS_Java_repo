import java.util.*;
public class Game
{
    ArrayList<Player> players = new ArrayList<Player>();
    private Deck deck;
    private Player player;
    private int[] winner;
    public Game(){
        player = new Player("Dealer", 100000);
        players.add(player);
        deck = new Deck(1);
    }

    public void addPlayer(String name){
        player = new Player(name);
        players.add(player);
    }

    public void addHuman(){
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        Player user = new Player(username);
        players.add(user);
    }

    public void setup(){
        if (deck.nCards() < 2 * players.size())
        {
            deck = new Deck(1);
        }
        deck.shuffle();
        for (int player = 0; player < players.size(); player ++){
            Hand tmphand = new Hand();
            for(int num = 0; num < 2; num ++){
                Card tmpcard = deck.draw();
                tmphand.addCard(tmpcard);
            }
            Player tmpplayer = players.get(player);
            tmpplayer.setHand(tmphand);
        }
        String out = "###Black Jack###\n";
        out += "---dealer---\nhand: " + (players.get(0)).hand(1) + " **\nchips: 100000\n";
        for (int player = 1; player < players.size(); player ++){
            out += "---" + (players.get(player)).name() + "---\nhand: "; 
            out += (players.get(player)).hand() + "\nchips: " + players.get(player).chips() + "\n";
        }
        System.out.println(out);
    }

    public void setupPlayer(){
        if (deck.nCards() < 2 * players.size()){
            deck = new Deck(1);
        }
        deck.shuffle();
        for (int player = 0; player < players.size(); player ++){
            Hand tmphand = new Hand();
            for(int num = 0; num < 2; num ++){
                Card tmpcard = deck.draw();
                tmphand.addCard(tmpcard);
            }
            Player tmpplayer = players.get(player);
            tmpplayer.setHand(tmphand);
        }
        String out = "###Black Jack###\n";
        out += "---dealer---\nhand: " + (players.get(0)).hand(1) + " **\nchips: 100000\n";
        for (int player = 1; player < players.size(); player ++){
            out += "---" + (players.get(player)).name() + "---\nhand: "; 
            out += (players.get(player)).hand() + "\nchips: " + players.get(player).chips() + "\n";
        }
        System.out.println(out);
        if (players.get(1).chips() > 0){
            int userbet = 1000000000;
            while (players.get(1).chips() < userbet){
                System.out.println("How much would you like to bet (At least 0)");
                Scanner scanner = new Scanner(System.in);
                userbet = scanner.nextInt();
                players.get(1).setBet(userbet);
            }
        }
    }

    public void playRound(){
        winner = new int[players.size()];
        int dealerVal = 0;
        int tmpPlayerVal;
        for (int player = 0; player < players.size(); player ++){
            if (player == 0){
                Player dealer = players.get(0);
                dealerVal = dealer.getScore();
            }
            else{
                Player tmpplayer = players.get(player);
                tmpPlayerVal = tmpplayer.getScore();
                Player dealer = players.get(0);
                if (tmpPlayerVal > dealerVal){
                    winner[player] = 1;
                    int tmpChip = tmpplayer.chips() + tmpplayer.bet();
                    tmpplayer.setChips(tmpChip);
                    int tmpDealerChip = dealer.chips() - tmpplayer.bet();
                    dealer.setChips(tmpDealerChip);
                }else{
                    int tmpChip = tmpplayer.chips() - tmpplayer.bet();
                    tmpplayer.setChips(tmpChip);
                    int tmpDealerChip = dealer.chips() + tmpplayer.bet();
                    dealer.setChips(tmpDealerChip);
                }
            }
        }
    }

    public int broke(){
        int out = 0;
        for (Player player: players)
        {
            if (player.chips() <= 0)
            {
                out ++;
            }
        }
        return out;
    }

    public void summary(){
        String out = "###RESULTS###\n";
        out += "---dealer---\nhand: " + (players.get(0)).hand() + "\nchips: "+ players.get(0).chips() + "\n";
        for (int player = 1; player < players.size(); player ++){
            out += "---" + (players.get(player)).name() + "---\nhand: "; 
            out += (players.get(player)).hand() + "\nchips: " + players.get(player).chips() + "\n";
            if (winner[player] == 1){
                out += "This player wins!\n";
            }else{
                out += "This player loses\n";
            }
        }
        System.out.println(out);
    }
}
