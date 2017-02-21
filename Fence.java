import java.util.Random;

public class Fence extends Rectangle
{
	private int x;
	private int y;
	private int w;
	private int h;
	private int speed = 10;
	private int numFences = 0;
	Random rand = new Random();
	Boolean reached = false;

	public Fence(int x, int y, int w, int h, java.lang.String col, GameArena arena)
	{

		super(x, y, w, h, col);
		// arena.addRectangle(r);
		// Ball post = new Ball(x, y-75, 17, "YELLOW");
		// arena.addBall(post);
	}

  /*
	public int getXPosition()
	{
		return x;
	}

	public void setXPosition(int newX)
	{
		x = newX;
	}
	*/

	public int getSpeed()
	{
		return speed;
	}

	public void setSpeed(int newS)
	{
		speed = newS;
	}

	private int increment = 0;
	public void move()
	{
		setXPosition(getXPosition() - getSpeed());
		if (getXPosition() < (0 - (getWidth() / 2)))
			setXPosition(1350);
		increment++;
		if (increment == 150 && getSpeed() < 30)
		{
			setSpeed(getSpeed() + 1);
			increment = 0;
		}
		if (getSpeed() >= 30)
			reached = true;
		if (getXPosition() > 1300 && reached)
			setSpeed(rand.nextInt(25) + 10);
	}

}
