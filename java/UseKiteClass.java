import hsa.Console;
import java.awt.*;

class UseKiteClass
{
    public static void main (String[] args)
    {
	Console c = new Console();
	
	KiteClass k1 = new KiteClass();
	KiteClass k2 = new KiteClass();
	int randInt;
	
	randInt = (int) (Math.random () * 100) + 1;
	k1.setWidth(randInt);
	randInt = (int) (Math.random () * 100) + 1;
	k1.setHeight(randInt);
	randInt = (int) (Math.random () * 100) + 1;
	k1.setCenter(randInt);
	k1.setColour(Color.blue);
	
	randInt = (int) (Math.random () * 100) + 1;
	k2.setWidth(randInt);
	randInt = (int) (Math.random () * 100) + 1;
	k2.setHeight(randInt);
	randInt = (int) (Math.random () * 100) + 1;
	k2.setCenter(randInt);
	k2.setColour(Color.blue);
	
	//k1.rotate(c,"ccw");
	k1.draw(c);
	k2
    }
}
