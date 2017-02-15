import javafx.scene.paint.*;

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
		if (Driver.b.getXPosition() == -100)
			col = Color.web("003366");
		else if (Driver.b.getXPosition() < 640 && i == 300)
		{
			col = col.brighter();
			i = 0;
		}
		else if (Driver.b.getXPosition() < 1380 && i == 300)
		{
				col = col.darker();
				i = 0;
		}
		r.changeColour(col.toString());
		i++;
	}

}
