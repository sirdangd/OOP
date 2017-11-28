import hsa.Console;
import java.awt.*;

class KiteClass
{
    private int iWidth = 80;
    private int iHeight = 80;
    private int iCentreX = 80;
    private int iCentreY = 80;
    private int iTailLength = 80;
    private Color iColour = Color.black;
    private char[] stringDirection = {'N', 'E', 'S', 'W'};
    private int d = 2;

    public void setWidth (int iNewWidth)
    {
	iWidth = iNewWidth;
    }


    public void setHeight (int iNewHeight)
    {
	iHeight = iNewHeight;
    }


    public void setCenter (int iNewCentreX, int iNewCentreY)
    {
	iCentreX = iNewCentreX;
	iCentreY = iNewCentreY;
    }


    public void setTailLength (int iNewTailLength)
    {
	iTailLength = iNewTailLength;
    }


    public void setColour (Color cNewColor)
    {

	iColour = cNewColor;
    }


    public int getWidth ()
    {
	return iWidth;
    }


    public int getHeight ()
    {
	return iHeight;
    }


    public int getCenterX ()
    {
	return iCentreX;
    }


    public int getCenterY ()
    {
	return iCentreY;
    }


    public int getTailLength ()
    {
	return iTailLength;
    }


    public Color getColour ()
    {
	return iColour;
    }


    public void draw (Console c, char stringDir)
    {
	int iPointsX[] = new int [4];
	int iPointsY[] = new int [4];

	iPointsX [0] = iCentreX - iWidth / 2;
	iPointsY [0] = iCentreY;
	iPointsX [1] = iCentreX;
	iPointsY [1] = iCentreY - iHeight / 2;
	iPointsX [2] = iCentreX + iWidth / 2;
	iPointsY [2] = iCentreY;
	iPointsX [3] = iCentreX;
	iPointsY [3] = iCentreY + iHeight / 2;

	c.setColor (iColour);

	c.fillPolygon (iPointsX, iPointsY, 4);

	if (stringDir == stringDirection[0])
	{
	    c.drawLine (iCentreX, iCentreY, iCentreX, iCentreY + (iHeight / 2) + iTailLength);
	}
	else if (stringDir == stringDirection[1])
	{
	    c.drawLine (iCentreX, iCentreY, iCentreX + (iWidth / 2) + iTailLength, iCentreY);
	}
	else if (stringDir == stringDirection[2])
	{
	    c.drawLine (iCentreX, iCentreY, iCentreX, iCentreY - (iHeight / 2) - iTailLength);
	}
	else
	{
	    c.drawLine (iCentreX, iCentreY, iCentreX - (iWidth / 2) - iTailLength, iCentreY);
	}
    }


    public void draw (Console c)
    {
	int iPointsX[] = new int [4];
	int iPointsY[] = new int [4];

	iPointsX [0] = iCentreX - iWidth / 2;
	iPointsY [0] = iCentreY;
	iPointsX [1] = iCentreX;
	iPointsY [1] = iCentreY - iHeight / 2;
	iPointsX [2] = iCentreX + iWidth / 2;
	iPointsY [2] = iCentreY;
	iPointsX [3] = iCentreX;
	iPointsY [3] = iCentreY + iHeight / 2;

	c.setColor (iColour);

	c.fillPolygon (iPointsX, iPointsY, 4);


	c.drawLine (iCentreX, iCentreY, iCentreX, iCentreY - (iHeight / 2) - iTailLength);
	d = 2;
    }


    public void rotate (Console c, String cwccw)
    {
	if (cwccw == "cw")
	{
	    iWidth = iHeight;
	    iHeight = iWidth;
	    if (d > 3)
	    {
		d = 0;
	    }
	    else
	    {
		d = d + 1;
	    }
	    erase(c);
	    draw (c, stringDirection [d]);
	}
	else if (cwccw == "ccw")
	{
	    iWidth = iHeight;
	    iHeight = iWidth;
	    if (d < 0)
	    {
		d = 3;
	    }
	    else
	    {
		d = d - 1;
	    }
	    erase(c);
	    draw (c, stringDirection [d]);
	}
    }
    
    public void erase (Console c)
    {
	Color cOldColour = getColour ();
	iColour = Color.white;
	delay (3000);
	draw (c);
	iColour = cOldColour;
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
