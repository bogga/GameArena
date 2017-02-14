public class Sun extends Ball{

public Sun()
{
	super(0, 720, 50, "ORANGE");
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
	else
		setYPosition(getYPosition() + getSpeed());
}

}