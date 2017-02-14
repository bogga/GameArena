public class SmartRectangle extends Rectangle
{

	public String col;

	public SmartRectangle(double x, double y, double w, double h, java.lang.String col)
	{
		super(x, y, w, h, col);
	}

	public void changeColour(String newCol)
	{
		col = newCol;
	}
}