public class Cresent extends Sun
{
  public Cresent()
  {
  super("RED");
//001F3D
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

  public void cresentBoolArcMove()
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
