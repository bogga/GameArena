public class Driver
{

	public static Ball b;
	public static Rectangle grass;

	public static void main(String[] args)
	{
		IntArena arena = new IntArena(1280, 720);
		b = new Ball(640, 360, 20, "MAGENTA");

		arena.addBall(b);
		grass = new Rectangle(640, 720, 1280, 30, "GREEN");
		arena.addRectangle(grass);
		while ("hell" != "frozen")
		{
			arena.move();
			arena.pause();
		}
		
	}
}