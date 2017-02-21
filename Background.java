import javafx.scene.paint.*;

/**
 * This class creates a background for the GameArena.
 *
 * It 'reacts' to the x co-ordinates (and through this the y co-ordinates) of the Sun to change shade accordingly.
 *
 * @see GameArena
 * @see Sun
 *
 * @author Adam Bogg, Harry Almond
 */

public class Background
{
	public SmartRectangle r;
	int i = 0;
	//public int col = 003366;
	public Color col = Color.web("003366");

	public Background(GameArena arena)
	{
		r = new SmartRectangle(640, 360, 1280, 720, "003366");
		arena.addRectangle(r);
	}

	public void change()
	{
		if (Driver.b.getXPosition() == -90)
		{
			col = Color.web("003366");
			i = 0;
		}
		else if (Driver.b.getXPosition() < 640 && Driver.b.getXPosition() > 0 && i == 200)
		{
			col = col.brighter();
			i = 0;
		}
		else if (Driver.b.getXPosition() < 1380 && Driver.b.getXPosition() > 0 && i == 200)
		{
				col = col.darker();
				i = 0;
		}
		r.changeColour(col.toString());
		i++;
	}
}
