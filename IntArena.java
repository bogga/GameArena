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
	 * @return the speed of the movement of the specific Ball instance.
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

	private Boolean jumping = false;
	private int jumpHeight = 20;

	/**
	* Checks for engagement of the jump key and moves the Sheep instance appropriately.
	*
	*/

	public void jump()
	{
		if (upPressed() && !jumping)
		{
			for (int i = -jumpHeight; i <= jumpHeight; i++)
			{
				// pause();
				Driver.s2.updateY(Driver.s2.getYPosition() + i);
			}
			jumping = true;
		}
		if (Driver.s2.getYPosition() == 650)
			jumping = false;
	}

	private int jumpCounter = 0;

	public void betterJump()
	{
		if (upPressed() && !jumping)
			jumping = true;
		if (jumping)
		{
			if (jumpCounter >= 0 && jumpCounter < 15)
				Driver.s2.updateY(Driver.s2.getYPosition() - 10);
			if (jumpCounter >= 25 && jumpCounter < 40)
				Driver.s2.updateY(Driver.s2.getYPosition() + 10);
			tally();
			// make it stay in the air for longer
		}
		if (Driver.s2.getYPosition() == 650)
			jumping = false;
	}

	public void tally()
	{
		if (jumpCounter < 40)
			jumpCounter++;
		else
			jumpCounter = 0;
	}

	public void fail()
	{
		exit();
		Driver.setGame(false);
	}
}
