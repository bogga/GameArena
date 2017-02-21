public class Driver
{

	public static Sun b;
	public static Moon m;
	public static Rectangle grass;
	public static Sheep s1;
	public static Sheep s2;
	public static Cresent cresent;
	public static IntArena arena;

	private static Boolean game = true;

	public static void setGame(Boolean in)
	{
		game = in;
	}

	public static void main(String[] args)
	{
		arena = new IntArena(1280, 720);
		b = new Sun();
		m = new Moon();
		cresent = new Cresent();
		Background bg = new Background(arena);

		arena.addBall(b);
		arena.addBall(m);
		arena.addBall(cresent);
		grass = new Rectangle(640, 720, 1280, 30, "GREEN");
		arena.addRectangle(grass);
		s1 = new Sheep(640, 650, 100, 30, "WHITE", arena);
		s2 = new Sheep(300, 650, 120, 20, "GREY", arena);

		Cloud c = new Cloud(640, 100, arena);
		Cloud c1 = new Cloud(150, 90, arena);
		Cloud c2 = new Cloud(1000, 110, arena);

		Fence gate = new Fence(1300, 705, 30, 170, "#a3734e", arena);
		arena.addRectangle(gate);

		while (game)
		{
			arena.pause();
			arena.betterJump();
			b.boolArcMove();
			m.moonBoolArcMove();
			cresent.cresentBoolArcMove();
			bg.change();
			c.move();
			c1.move();
			c2.move();
			gate.move();
			s1.shiftLeft();
		  gatec.collision(s1);
		}
	}
}
