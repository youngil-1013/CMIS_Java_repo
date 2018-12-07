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
