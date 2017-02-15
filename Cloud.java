import java.util.Random;

public class Cloud
{

	public static Random rand = new Random();
	public static String col;
	public static Ball array[];
	public static double speed = 0.5;

	public int x, y;

	public Cloud(int x, int y, GameArena arena)
	{
		if (rand.nextBoolean())
			col = "WHITE";
		else
			col = "GRAY";
		array = new Ball[3];
		array[0] = new Ball(x, y, 50, col);
		array[1] = new Ball(x - 50, y - 5, 30, col);
		array[2] = new Ball(x + 50, y + 10, 30, col);
		for (int i = 0; i < 3; i++)
			arena.addBall(array[i]);
	}

	public void move()
	{
		for (int i = 0; i < 3; i++)
		{
			array[i].setXPosition(array[i].getXPosition() + speed);
		}

		if (array[1].getXPosition() > 1380)
		{
			array[0].setXPosition(-50);
			array[1].setXPosition(-100);
			array[2].setXPosition(0);
		}
	}

}
