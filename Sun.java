public class Sun extends Ball
{

	public Sun()
	{
		super(-100, 720, 100, "ORANGE");
		//super(640, 360, 100, "ORANGE");
	}

	private static int speed = 1;

	public int getSpeed()
	{
		return speed;
	}

	public void move()
	{
		setXPosition(getXPosition() + getSpeed());
		if (getXPosition() < 640)
			setYPosition(getYPosition() - getSpeed()) ;
		else if (getXPosition() < 1380)
			setYPosition(getYPosition() + getSpeed());
		else
			setXPosition(-100);
	}

	public void arcMove()
	{
		setYPosition((getXPosition() * (getXPosition() - 1380)) + 720);
		setXPosition(getXPosition() + getSpeed());
		if (getXPosition() > 1380)
			setXPosition(-100);
	}
}