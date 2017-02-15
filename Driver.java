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

		Cloud c = new Cloud(640, 100, arena, 0);
		Cloud c1 = new Cloud(150, 90, arena, 1);
		Cloud c2 = new Cloud(1000, 110, arena, 2);

		while ("hell" != "frozen")
		{
			arena.move();
			arena.pause();
			b.arcMove();
			//bg.change();
			c.move(0);
			c1.move(1);
			c2.move(2);
		}
	}
}
