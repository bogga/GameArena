public class Background
{

	public Rectangle r;

	public Background(GameArena arena)
	{
		r = new Rectangle(640, 360, 1280, 720, "003366");
		arena.addRectangle(r);
	}

	/*
	GET JOE TO ADD changeColour method
	public void change(GameArena arena, Ball b)
	{
		if (arena.b.getXPosition() < 640)
			r.changeColour();
	}
	*/
}