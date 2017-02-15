public class Background
{

	public SmartRectangle r;
	public int col = 003366;
	public int colCopy = col;

	public Background(GameArena arena)
	{
		r = new SmartRectangle(640, 360, 1280, 720, "003366");
		arena.addRectangle(r);
	}

	// GET JOE TO ADD changeColour method
	// this is trash
	/* public void change()
	{
		col = colCopy;
		if (Driver.b.getXPosition() == -100)
			col = 003366;
		else if (Driver.b.getXPosition() < 640)
		{
			//r.changeColour();
			col = (col & 0x7f7f7f) >> 1;
		}
		else if (Driver.b.getXPosition() < 1380)
			col = (col & 0xfefefe) << 1;
		colCopy = col;
		col.toString();
		r.changeColour(col);
	}
	*/
}
