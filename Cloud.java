import java.util.Random;

public class Cloud
{

	private Random rand = new Random();
	public String col;
	public static Ball array[] = new Ball[600];
	public static double speed = -0.5;
	public int id = Cloud.nextId++;
	private static int nextId = 0;

	public int x, y;

	public Cloud(int x, int y, GameArena arena)
	{
		if (rand.nextBoolean())
			col = "WHITE";
		else
			col = "GRAY";
		array[3 * id] = new Ball(x, y, 50, col);
		array[(3 * id) + 1] = new Ball(x - 50, y - 5, 30, col);
		array[(3 * id) + 2] = new Ball(x + 50, y + 10, 30, col);
		for (int i = 0; i < 3; i++)
			arena.addBall(array[(3 * id) + i]);
	}

	public void move()
	{
		array[3 * id].setXPosition(array[3 * id].getXPosition() + speed);
		array[(3 * id) + 1].setXPosition(array[(3 * id) + 1].getXPosition() + speed);
		array[(3 * id) + 2].setXPosition(array[(3 * id) + 2].getXPosition() + speed);

		if (array[(3 * id) + 1].getXPosition() > 1380)
		{
			array[3 * id].setXPosition(-100);
			array[(3 * id) + 1].setXPosition(-150);
			array[(3 * id) + 2].setXPosition(-50);
		}

		if (array[(3 * id) + 2].getXPosition() < -100)
		{
			array[3 * id].setXPosition(1380);
			array[(3 * id) + 1].setXPosition(1330);
			array[(3 * id) + 2].setXPosition(1430);
		}
	}
}
