public class Moon extends Sun
{
  private Ball cresent;

  public Moon()
  {
    super("WHITE");
  }

  private static Boolean sunMoving = true;

  public static Boolean getSM()
  {
    return sunMoving;
  }

  public static void setSM(Boolean in)
  {
    sunMoving = in;
  }

  public void moonBoolArcMove()
	{
		if (!getSM())
		{
			setXPosition(getXPosition() + getSpeed());
			setYPosition(getYPosition() - ySpeed);
			ySpeed = ySpeed - 0.0014;
			if (getXPosition() > 1380)
				{
					ySpeed = firstYSpeed;
					setXPosition(-100);
					setYPosition(720);
					setSM(true);
				}


		}
	}
}
