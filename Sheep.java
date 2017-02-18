import java.util.Random;
public class Sheep{

public static Random rand = new Random();

public Sheep(int x, int y, int w, int h, java.lang.String col, GameArena arena){

	if (rand.nextBoolean())
		col = "WHITE";
	else
		col = "GRAY";
	Ball head = new Ball(x+50, y-(h/2), 20, "PINK");
	Ball headCover = new Ball(x+50, y-(h/2)+7, 7, "PINK");
	Ball mouth = new Ball(x+50, y-(h/2)+9, 7, "BLACK");
	Ball eyer = new Ball(x+42, y-(h/2), 3, "BLACK");
	Ball eyel = new Ball(x+58, y-(h/2), 3, "BLACK");
	Ball arse = new Ball(x-40, y, 25, col);
	Ball abdomen = new Ball(x, y, 40, col);
	Ball neck = new Ball(x+40, y, 20, col);
	Rectangle legBack = new Rectangle(x-30, y+30, 10, 50, "BLACK");
	Rectangle legFront = new Rectangle(x+30, y+30, 10, 50, "BLACK");
	arena.addRectangle(legBack);
	arena.addRectangle(legFront);
	arena.addBall(arse);
	arena.addBall(abdomen);
	arena.addBall(neck);
	arena.addBall(head);
	arena.addBall(mouth);
	arena.addBall(eyel);
	arena.addBall(eyer);

	arena.addBall(headCover);

}

}
