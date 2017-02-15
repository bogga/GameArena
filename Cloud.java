import java.util.Random;

public class Cloud
{

	private static Random rand = new Random();
	public static String col;
	public static Ball array[] = new Ball[600];
	public static double speed = -5;
	public static int id = 0;

	public int x, y;

	public Cloud(int x, int y, GameArena arena, int inID)
	{
		if (rand.nextBoolean())
			col = "WHITE";
		else
			col = "GRAY";
		array[3 * inID] = new Ball(x, y, 50, col);
		array[(3 * inID) + 1] = new Ball(x - 50, y - 5, 30, col);
		array[(3 * inID) + 2] = new Ball(x + 50, y + 10, 30, col);
		for (int i = 0; i < 3; i++)
			arena.addBall(array[(3 * inID) + i]);
	}

	public void move(int input)
	{
		array[3 * input].setXPosition(array[3 * input].getXPosition() + speed);
		array[(3 * input) + 1].setXPosition(array[(3 * input) + 1].getXPosition() + speed);
		array[(3 * input) + 2].setXPosition(array[(3 * input) + 2].getXPosition() + speed);

		if (array[(3 * input) + 1].getXPosition() > 1380)
		{
			array[3 * input].setXPosition(-100);
			array[(3 * input) + 1].setXPosition(-150);
			array[(3 * input) + 2].setXPosition(-50);
		}

		if (array[(3 * input) + 2].getXPosition() < -100)
		{
			array[3 * input].setXPosition(1380);
			array[(3 * input) + 1].setXPosition(1330);
			array[(3 * input) + 2].setXPosition(1430);
		}
	}
}
