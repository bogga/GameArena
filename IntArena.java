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
			Driver.b.setYPosition(Driver.b.getYPosition() - speed);
		if (downPressed())
			Driver.b.setYPosition(Driver.b.getYPosition() + speed);
		if (leftPressed())
			Driver.b.setXPosition(Driver.b.getXPosition() - speed);
		if (rightPressed())
			Driver.b.setXPosition(Driver.b.getXPosition() + speed);
	}
}