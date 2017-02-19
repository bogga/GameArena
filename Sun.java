public class Sun extends Ball
{

	public Sun()
	{
		super(-100, 720, 100, "ORANGE");
		//super(640, 360, 100, "ORANGE");
	}

	public Sun(String col)
	{
		super(-100, 720, 100, col);
	}

	private static int speed = 1;
	public static double firstYSpeed = 1;
	public static double ySpeed = firstYSpeed;

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
		setXPosition(getXPosition() + getSpeed());
		setYPosition(getYPosition() - ySpeed);
		ySpeed = ySpeed - 0.0014;
		if (getXPosition() > 1380)
			{
				ySpeed = firstYSpeed;
				setXPosition(-100);
				setYPosition(720);
			}
	}

	public void boolArcMove()
	{
		if (Moon.getSM())
		{
			setXPosition(getXPosition() + getSpeed());
			setYPosition(getYPosition() - ySpeed);
			ySpeed = ySpeed - 0.0014;
			if (getXPosition() > 1380)
				{
					ySpeed = firstYSpeed;
					setXPosition(-100);
					setYPosition(720);
					Moon.setSM(false);
				}
		}
	}
}
