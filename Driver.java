public class Driver
{

	public static Ball b;

	public static void main(String[] args)
	{
		IntArena arena = new IntArena(1280, 720);
		b = new Ball(640, 360, 20, "MAGENTA");

		arena.addBall(b);
		while ("hell" != "frozen")
		{
			arena.move(b);
			arena.pause();
		}
	}
}