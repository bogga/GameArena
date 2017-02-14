import java.util.Random;
public class Sheep{

public static Random rand = new Random();

public Sheep(int x, int y, int w, int h, java.lang.String col, GameArena arena){
	if (rand.nextBoolean())
		col = "WHITE";
	else
		col = "GRAY";
	Ball head = new Ball(x+50, y-(h/2), 20, "PINK");
	Rectangle body = new Rectangle(x, y, w, h, col);
	arena.addRectangle(body);
	arena.addBall(head);
	
}

}