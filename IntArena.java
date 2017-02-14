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

	/* public void move(Ball entity)
	{
		if (upPressed())
			Driver.entity.setYPosition(getYPosition() - speed);
		if (downPressed())
			Driver.entity.setYPosition(getYPosition() + speed);
		if (leftPressed())
			Driver.entity.setXPosition(getXPosition() - speed);
		if (rightPressed())
			Driver.entity.setXPosition(getXPosition() + speed);
	}
	*/
}