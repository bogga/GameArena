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

		NewCloud c = new NewCloud(640, 100, arena);
		NewCloud c1 = new NewCloud(150, 90, arena);
		NewCloud c2 = new NewCloud(1000, 110, arena);

		while ("hell" != "frozen")
		{
			arena.move();
			arena.pause();
			b.arcMove();
			//bg.change();
			c.move(0); //CLOUD CLASS IS WRONG - FIX
			c1.move(1);
			c2.move(2);
		}
	}
}
