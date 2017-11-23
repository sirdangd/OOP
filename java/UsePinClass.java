import hsa.Console;
import java.awt.*;

class UsePinClass
{
    public static void main (String[] args)
    {
	Console c = new Console();
	
	PinClass p1 = new PinClass();
	
	p1.setBallCentre (50,80);
	p1.setPointCentre (100,120);
	
	p1.draw(c);
	p1.erase(c);
    }
}
