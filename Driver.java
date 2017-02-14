public class Driver
{

	public static Ball b;
	public static Rectangle grass;
	public static Sheep s1;
	public static Sheep s2;

	public static void main(String[] args)
	{
		IntArena arena = new IntArena(1280, 720);
		b = new Ball(640, 360, 20, "MAGENTA");

		arena.addBall(b);
		grass = new Rectangle(640, 720, 1280, 3, "GREEN");
		arena.addRectangle(grass);
		s1 = new Sheep(640, 705, 100, 30, "WHITE");
		s2 = new Sheep(300, 705, 120, 20, "GREY");
		arena.addRectangle(s1);
		arena.addRectangle(s2);

		Cloud c = new Cloud(640, 100, arena);		

		while ("hell" != "frozen")
		{
			arena.move();
			arena.pause();
		}
	}
}