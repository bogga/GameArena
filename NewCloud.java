import java.util.Random;

public class NewCloud
{

  int num = 0;
  Ball array[];
  double speed = 0.5;

  public NewCloud(double x, double y, GameArena arena)
  {
    String col;
    Random rand = new Random();
    if (rand.nextBoolean())
			col = "WHITE";
		else
			col = "GRAY";
		array = new Ball[3];
		array[(3 * num)] = new Ball(x, y, 50, col);
		array[(3 * num) + 1] = new Ball(x - 50, y - 5, 30, col);
		array[(3 * num) + 2] = new Ball(x + 50, y + 10, 30, col);
		for (int i = 0; i < 3; i++)
			arena.addBall(array[i]);
    num++;
  }

  public void move(int num)
	{
		array[(3 * num)].setXPosition(array[(3 * num)].getXPosition() + speed);
    array[(3 * num) + 1].setXPosition(array[(3 * num) + 1].getXPosition() + speed);
    array[(3 * num) + 2].setXPosition(array[(3 * num) + 2].getXPosition() + speed);


		if (array[1].getXPosition() > 1380)
		{
			array[(3 * num)].setXPosition(-50);
			array[(3 * num) + 1].setXPosition(-100);
			array[(3 * num) + 2].setXPosition(0);
		}
	}
}
