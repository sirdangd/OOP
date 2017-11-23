import hsa.Console;
import java.awt.*;

class UseBallonClass
{
    public static void main (String[] args)
    {
	Console c = new Console ();

	BallonClass b = new BallonClass (50, 80, 50, 60, 70, Color.red);

	// BallonClass b1 = new BallonClass ();
	// BallonClass b2 = new BallonClass ();
	//
	// b1.setCenter(50,80);
	// b1.setWidth(50);
	// b1.setHeight(60);
	// b1.setTailLength(70);
	// b1.setColour(Color.blue);
	//
	// b2.setCenter(100,140);
	// b2.setWidth(50);
	// b2.setHeight(60);
	// b2.setTailLength(70);
	// b2.setColour(Color.red);

	b.draw (c);

	// if (b.isPointInside (500, 500) == true)
	// {
	//     b.grow (c);
	// }
	// else
	// {
	//     System.out.println ("ballon is safe");
	// }
	//b.delay (3000);
	//b.grow (1.2, c);
	//b1.erase(c);




    }
}
