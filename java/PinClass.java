import hsa.Console;
import java.awt.*;

class PinClass
{
    private int bWidth = 10;
    private int bHeight = 10;
    private int bCentreX = 80;
    private int bCentreY = 80;
    private int pCentreX = 80;
    private int pCentreY = 80;
    private Color iColour = Color.black;

    public void setBallCentre (int newBCentreX, int newBCentreY)
    {
	bCentreX = newBCentreX;
	bCentreY = newBCentreY;
    }


    public void setPointCentre (int newPCentreX, int newPCentreY)
    {
	pCentreX = newPCentreX;
	pCentreY = newPCentreY;
    }

    public void setColour (Color cNewColor)
    {
	iColour = cNewColor;
    }


    public int getWidth ()
    {
	return bWidth;
    }


    public int getHeight ()
    {
	return bHeight;
    }


    public int getBallCentreX ()
    {
	return bCentreX;
    }


    public int getBallCentreY ()
    {
	return bCentreY;
    }


    public int getPointCentreX ()
    {
	return pCentreX;
    }


    public int getPointCentreY ()
    {
	return pCentreY;
    }


    public void draw (Console c)
    {
	int upperLeftCornerX = bCentreX - (bWidth / 2);
	int upperLeftCornerY = bCentreY - (bHeight / 2);
	c.setColour(iColour);
	c.fillOval (upperLeftCornerX, upperLeftCornerY, bWidth, bHeight);
	c.drawLine (bCentreX, bCentreY, pCentreX, pCentreY);
    }


    public void erase (Console c)
    {
	iColour = Color.white;
	delay (3000);
	draw (c);
    }


    public void delay (int iDelayTime)
    {
	long lFinalTime = System.currentTimeMillis () + iDelayTime;
	do
	{
	}
	while (lFinalTime >= System.currentTimeMillis ());
    }
}


