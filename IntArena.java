/**
 * This class extends the GameArena class.
 *
 * This changes the title of the window to "Sleep Simulator 2018" and enables movement of a specific instance of the Ball class.
 *
 * @see GameArena
 * @see Ball
 * @see Rectangle
 *
 * @author Adam Bogg, Harry Almond
 */

public class IntArena extends GameArena
{

	private int speed = 5;

	/**
	 * Returns the speed of the movement of the specific instance of the Ball class.
	 *
	 */

	public int getSpeed()
	{
		return speed;
	}

	/**
     * Constructor. Creates an instance of the IntArena class, and displays a window on the
     * screen upon which shapes can be drawn.
     *
     * @param x The width of the window, in pixels.
     * @param y The height of the window, in pixels.
	 */

	public IntArena(int x, int y)
	{
		super(x, y);
		changeTitle("Sleep Simulator 2018");
	}

	/**
	* Checks for engagement of the movement keys and moves the Ball instance appropriately.
	*
	*/

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
