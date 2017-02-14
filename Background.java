public class Background
{

	public SmartRectangle r;
	public int col;

	public Background(GameArena arena)
	{
		r = new SmartRectangle(640, 360, 1280, 720, "003366");
		arena.addRectangle(r);
	}
	
	// GET JOE TO ADD changeColour method
	// this is trash
	public void change()
	{
		if (Driver.b.getXPosition() < 640)
		{
			//r.changeColour();
			col = (col & 0x7f7f7f) >> 1;
		}
		else
			col = (col & 0xfefefe) << 1;
		r.changeColour(String.valueOf(col));
	}
}