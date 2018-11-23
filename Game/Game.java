import java.util.Scanner;
public class Game
{
    public static void main (String [] args)
    {
        boolean gameOver = false;
        String [][] Map = {{"o","o","o"},{"o","o","o"},{"o","o","o"}};
        int exitY = (int) (Math.random() * (Map.length));
        int exitX = (int) (Math.random() * (Map[0].length));
        Map [exitY][exitX] = "X";
        int playerY = exitY;
        int playerX = exitX;
        while (playerY == exitY && playerX == exitX)
        {
            playerY = (int) (Math.random() * (Map.length));
            playerX = (int) (Math.random() * (Map.length));
        }
        Map [playerY][playerX] = "P";
        Print (Map);
        // Made Map
        Scanner scan = new Scanner (System.in);

        while (gameOver == false)
        {
            String input = scan.next();
            if (input == "1")
            {
                Map [playerY - 1][playerX] = Map [playerY][playerX];
                Map [playerY][playerX] = "o";
                Print (Map);
                gameOver=true;
            }
        }
    }

    public static void Print (String map [][])
    {
        for (int y = 0; y < map.length; y ++)
        {     
            for (int x = 0; x < map[0].length; x ++)
            {
                System.out.print(map[y][x] + " ");
            }
            System.out.println("");
        }
    }
}
