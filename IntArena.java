public class IntArena extends GameArena
{

	private int speed = 5;

	public int getSpeed()
	{
		return speed;
	}

	public IntArena(int x, int y)
	{
		super(x, y);
	}

	public void move()
	{
		if (upPressed())
			Driver.b.setYPosition(getYPosition() - speed);
		if (downPressed())
			Driver.b.setYPosition(getYPosition() + speed);
		if (leftPressed())
			Driver.b.setXPosition(getXPosition() - speed);
		if (rightPressed())
			Driver.b.setXPosition(getXPosition() + speed);
	}
}