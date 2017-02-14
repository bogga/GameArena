import java.util.Random;

public class Rain
{
	public static Random rand = new Random();
	public static String col = "BLUE";
	public static Rectangle[] array;

	public Rain(Cloud cloud, GameArena arena)
	{
		array = new Rectangle[3];
		if (rand.nextBoolean())
			col = "CYAN";
		array[0] = new Rectangle(cloud.x - 10, cloud.y, 3, 8, col);
		if (rand.nextBoolean())
			col = "CYAN";		
		array[1] = new Rectangle(cloud.x, cloud.y, 3, 9, col);
		if (rand.nextBoolean())
			col = "CYAN";		
		array[2] = new Rectangle(cloud.x + 10, cloud.y, 3, 9, col);

		for (int i = 0; i < 3; i++)
			arena.addRectangle(array[i]);
	}

	public void move()
	{
		for (int i = 0; i < 3; i++)
		{
			array[i].setYPosition(array[i].getYPosition() + 5);
		}
	}
}