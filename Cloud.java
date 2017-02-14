public class Cloud
{
	public Cloud(int x, int y, GameArena arena)
	{
		Ball array[] = new Ball[3];
		array[0] = new Ball(x, y, 50, "WHITE");
		array[1] = new Ball(x - 150, y - 5, 30, "WHITE");
		array[2] = new Ball(x + 100, y + 5, 30, "WHITE");
		for (int i = 0; i < 3; i++)
			arena.addBall(array[i]);
	}
}