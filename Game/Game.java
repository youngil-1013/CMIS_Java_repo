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
                if (Map [playerY - 1][playerX] != Character.toString(('\u258A')))
                {
                    Map [playerY - 1][playerX] = Map [playerY][playerX];
                    Map [playerY][playerX] = "o";
                    playerY = playerY - 1; 
                    playerX = playerX;
                    Print (Map);
                }
                else
                {
                    Print (Map);
                }
            }
            else if (input.equals("s"))
            {
                if (Map [playerY + 1][playerX] != Character.toString(('\u258A')))
                {
                    Map [playerY + 1][playerX] = Map [playerY][playerX];
                    Map [playerY][playerX] = "o";
                    playerY = playerY + 1; 
                    playerX = playerX;
                }
                Print (Map);
            }
            else if (input.equals("a"))
            {
                if (Map [playerY][playerX - 1] != Character.toString(('\u258A')))
                {
                    Map [playerY][playerX - 1] = Map [playerY][playerX];
                    Map [playerY][playerX] = "o";
                    playerY = playerY; 
                    playerX = playerX - 1;
                }
                Print (Map);
            }
            else if (input.equals("d"))
            {
                if (Map [playerY][playerX + 1] != Character.toString(('\u258A')))
                {
                    Map [playerY][playerX + 1] = Map [playerY][playerX];
                    Map [playerY][playerX] = "o";
                    playerY = playerY; 
                    playerX = playerX + 1;
                }
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
