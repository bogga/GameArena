public class Sun extends Ball{

public Sun()
{
	super(0, 720, 100, "ORANGE");
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

}