import java.util.Random;

public class Cloud
{

	public static Random rand = new Random();
	public static String col;

	public Cloud(int x, int y, GameArena arena)
	{
		if (rand.nextBoolean())
			col = "WHITE";
		else
			col = "GRAY";
		Ball array[] = new Ball[3];
		array[0] = new Ball(x, y, 50, col);
		array[1] = new Ball(x - 50, y - 5, 30, col);
		array[2] = new Ball(x + 50, y + 10, 30, col);
		for (int i = 0; i < 3; i++)
			arena.addBall(array[i]);
	}
}