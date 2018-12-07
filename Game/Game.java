import java.util.Scanner;
public class Game
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("What is the map's width");
        String Swidth = scan.next();
        System.out.println("What is the map's height");
        String Sheight = scan.next();
        int width = Integer.parseInt(Swidth);
        int height = Integer.parseInt(Sheight);
        // Input for Map Size
        boolean gameOver = false;
        String [][] Map = new String [height][width];
        for (int y = 0; y < height; y ++)
        {     
            for (int x = 0; x < width; x ++)
            {
                Map [y][x] = "o";
            }
        }
        int exitY = (int) (Math.random() * (Map.length));
        int exitX = (int) (Math.random() * (Map[0].length));
        Map [exitY][exitX] = "X";
        int playerY = exitY;
        int playerX = exitX;
        int playerTempY = 0;
        int playerTempX = 0;
        while (playerY == exitY && playerX == exitX)
        {
            playerY = (int) (Math.random() * (Map.length));
            playerX = (int) (Math.random() * (Map.length));
        }
        Map [playerY][playerX] = Character.toString(('\u25C9'));
        int Barrier = 3;
        for (int y = 0; y < height; y ++)
        {     
            for (int x = 0; x < width; x ++)
            {
                Barrier = (int) (Math.random() * 4);
                if (Barrier == 0 && Map [y][x] == "o")
                {
                    Map [y][x] = Character.toString(('\u258A'));
                }
            }
        }
        Print (Map);
        // Made Map
        while (gameOver == false)
        {
            String input = scan.next();
            if (input.equals("w"))
            {
                playerTempY = playerY - 1;
                playerTempX = playerX;
            }
            else if (input.equals("s"))
            {
                playerTempY = playerY + 1;
                playerTempX = playerX;
            }
            else if (input.equals("a"))
            {
                playerTempY = playerY;
                playerTempX = playerX - 1;
            }
            else if (input.equals("d"))
            {
                playerTempY = playerY;
                playerTempX = playerX + 1;
            }

            if (Map [playerTempY][playerTempX].equals(Character.toString(('\u258A'))))
            {
                Print (Map);
            }
            else
            {
                Map [playerTempY][playerTempX] = Map [playerY][playerX];
                Map [playerY][playerX] = "o";
                playerY = playerTempY; 
                playerX = playerTempX;
                Print (Map);
            }

            if (playerY == exitY && playerX == exitX)
            {
                gameOver = true; 
                System.out.println("Next Stage (Updating)");
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
