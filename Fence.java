public class Fence
{
	public Fence(int x, int y, int w, int h, java.lang.String col, GameArena arena)
	{
		Rectangle gate = new Rectangle(x, y, w, h, col);
		arena.addRectangle(gate);
		Ball post = new Ball(x, y-75, 17, "YELLOW");
		arena.addBall(post);

	}
}
