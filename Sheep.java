import java.util.Random;
public class Sheep
{
	public static Random rand = new Random();
	private Ball head;
	private Ball headCover;
	private Ball mouth;
	private Ball eyer;
	private Ball eyel;
	private Ball arse;
	private Ball abdomen;
	private Ball neck;
	private Rectangle legBack;
	private Rectangle legFront;
	private Rectangle collsionBox;

	private int height;

	private int x, y;

	private boolean collision = false;

	public int getYPosition()
	{
		return y;
	}

	public void setYPosition(int newY)
	{
		y = newY;
	}

	public int getXPosition()
	{
		return x;
	}

	public void setXPosition(int newX)
	{
		x = newX;
	}


	public Sheep(int inX, int inY, int w, int h, java.lang.String col, GameArena arena)
	{
		x = inX;
		y = inY;
		if (rand.nextBoolean())
			col = "WHITE";
		else
			col = "GRAY";
		head = new Ball(inX+50, inY-(h/2), 20, "PINK");
		headCover = new Ball(inX+60, inY-(h/2)+8, 7, "PINK"); //headCover is to make it so facial features can be created
		mouth = new Ball(inX+60, inY-(h/2)+10, 7, "BLACK");   //i.e. a mouth by using a headCover and a black Ball
		eyer = new Ball(inX+53, inY-(h/2), 3, "BLACK");
		eyel = new Ball(inX+58, inY-(h/2), 3, "BLACK");
		arse = new Ball(inX-40, inY, 25, col);
		abdomen = new Ball(inX, inY, 40, col);
		neck = new Ball(inX+40, inY, 20, col);
		legBack = new Rectangle(inX-30, inY+30, 10, 50, "BLACK");
		legFront = new Rectangle(inX+30, inY+30, 10, 50, "BLACK");
		collsionBox = new Rectangle(inX+5, inY+12, 135, 95, "RED");

	  arena.addRectangle(collsionBox);
		arena.addRectangle(legBack);
		arena.addRectangle(legFront);
		arena.addBall(arse);
		arena.addBall(abdomen);
		arena.addBall(neck);
		arena.addBall(head);
		arena.addBall(mouth);
	//	arena.addBall(eyel);
		arena.addBall(eyer);
		arena.addBall(headCover);
		height = h;
	}

	public void updateY(int y)
	{
		setYPosition(y);
		head.setYPosition(y - (height/2));
		legBack.setYPosition(y + 30);
		legFront.setYPosition(y + 30);
		arse.setYPosition(y);
		abdomen.setYPosition(y);
		neck.setYPosition(y);
		mouth.setYPosition(y - (height/2) + 10);
		eyer.setYPosition(y - (height/2));
		headCover.setYPosition(y - (height/2) + 8);
		collsionBox.setYPosition(y-(height/2)+12);
	}

	public void updateX(int x)
	{
		setXPosition(x);
		head.setXPosition(x + 50);
		legBack.setXPosition(x - 30);
		legFront.setXPosition(x + 30);
		arse.setXPosition(x - 40);
		abdomen.setXPosition(x);
		neck.setXPosition(x + 40);
		mouth.setXPosition(x + 60);
		eyer.setXPosition(x + 53);
		headCover.setXPosition(x + 60);
		collsionBox.setXPosition(x+5);
	}

	public void shiftLeft()
	{
		updateX(getXPosition() - 5);
	}
}
