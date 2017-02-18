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

	private int height;

	public Sheep(int x, int y, int w, int h, java.lang.String col, GameArena arena)
	{
		if (rand.nextBoolean())
			col = "WHITE";
		else
			col = "GRAY";
		head = new Ball(x+50, y-(h/2), 20, "PINK");
		headCover = new Ball(x+60, y-(h/2)+8, 7, "PINK"); //headCover is to make it so facial features can be created
		mouth = new Ball(x+60, y-(h/2)+10, 7, "BLACK");    //i.e. a mouth by using a headCover and a black Ball
		eyer = new Ball(x+53, y-(h/2), 3, "BLACK");
		eyel = new Ball(x+58, y-(h/2), 3, "BLACK");
		arse = new Ball(x-40, y, 25, col);
		abdomen = new Ball(x, y, 40, col);
		neck = new Ball(x+40, y, 20, col);
		legBack = new Rectangle(x-30, y+30, 10, 50, "BLACK");
		legFront = new Rectangle(x+30, y+30, 10, 50, "BLACK");

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

	public void update(int y)
	{
		head.setYPosition(y - (height/2));
		legBack.setYPosition(y + 30);
		legFront.setYPosition(y + 30);
		arse.setYPosition(y);
		abdomen.setYPosition(y);
		neck.setYPosition(y);
		mouth.setYPosition(y - (height/2));
		eyer.setYPosition(y - (height/2));
		headCover.setYPosition(y - (height/2));
	}

}
