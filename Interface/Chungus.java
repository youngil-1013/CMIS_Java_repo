public class Chungus implements Readable
{
    private String name = "Chungus";
    private int page = 100;
    
    public String words(){
        return name;
    }

    public void changeBook(String newTitle, int newNum){
        name = newTitle;
        page = newNum;
    }
}
