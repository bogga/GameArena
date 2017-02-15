public class Driver
{

	public static Sun b;
	public static Rectangle grass;
	public static Sheep s1;
	public static Sheep s2;

	public static void main(String[] args)
	{
		IntArena arena = new IntArena(1280, 720);
		b = new Sun();
		Background bg = new Background(arena);

		arena.addBall(b);
		grass = new Rectangle(640, 720, 1280, 30, "GREEN");
		arena.addRectangle(grass);
		s1 = new Sheep(640, 705, 100, 30, "WHITE", arena);
		s2 = new Sheep(300, 705, 120, 20, "GREY", arena);

		Cloud c = new Cloud(640, 100, arena);
		Cloud c1 = new Cloud(150, 90, arena);
		Cloud c2 = new Cloud(1000, 110, arena);

		Fence gate = new Fence(400, 705, 30, 150, "#a3734e", arena);

		while ("hell" != "frozen")
		{
			arena.pause();
			b.arcMove();
			//bg.change();
			c.move();
			c1.move();
			c2.move();
		}
	}
}
