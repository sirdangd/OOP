import hsa.Console;
import java.awt.*;
import BallonClass.java;

class BalloonMain
{

    static Console c;

    static int iWidth = 80;
    static int iHeight = 80;
    static int iCentreX = 80;
    static int iCentreY = 80;
    static int iTailLength = 80;
    static Color iColour = Color.red;

    public static void main (String[] args)
    {
	BallonClass b;
	b = new BallonClass ();

	b.draw(c);
    }
}
