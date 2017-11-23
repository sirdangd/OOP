
import hsa.Console;
import java.awt.*;

class UsePinBallon
{
    public static void main (String[] args)
    {
	Console c = new Console();
	
	PinClass p1 = new PinClass();
	PinClass p2 = new PinClass();
	
	BallonClass b1 = new BallonClass();
	BallonClass b2 = new BallonClass();
	
	int randInt;
	
	randInt = (int) (Math.random () * 100) + 1;
	p1.setBallCentre(randInt, randInt);
	randInt = (int) (Math.random () * 100) + 1;
	p1.setPointCentre(randInt, randInt);
	
	randInt = (int) (Math.random () * 100) + 1;
	p2.setBallCentre(randInt, randInt);
	randInt = (int) (Math.random () * 100) + 1;
	p2.setPointCentre(randInt, randInt);
	
	randInt = (int) (Math.random () * 100) + 1;
	b1.setCenter(randInt,randInt);
	randInt = (int) (Math.random () * 100) + 1;
	b1.setWidth(randInt);
	randInt = (int) (Math.random () * 100) + 1;
	b1.setHeight(randInt);
	randInt = (int) (Math.random () * 100) + 1;
	b1.setTailLength(randInt);
	randInt = (int) (Math.random () * 100) + 1;
	b1.setColour(Color.blue);
	
	randInt = (int) (Math.random () * 100) + 1;
	b2.setCenter(randInt,randInt);
	randInt = (int) (Math.random () * 100) + 1;
	b2.setWidth(randInt);
	randInt = (int) (Math.random () * 100) + 1;
	b2.setHeight(randInt);
	randInt = (int) (Math.random () * 100) + 1;
	b2.setTailLength(randInt);
	randInt = (int) (Math.random () * 100) + 1;
	b2.setColour(Color.red);
	
	p1.draw(c);
	//p1.erase(c);
	
	//p2.draw(c);
	//p2.erase(c);
	
	b1.draw(c);
	//b1.erase(c);
	if (b1.isPointInside (p1.getPointCentreX(), p1.getPointCentreY()) == true) {
	    b1.grow(c);
	}
	
	//b2.draw(c);
	//b2.erase(c);
	
    }
}
