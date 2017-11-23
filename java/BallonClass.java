import hsa.Console;
import java.awt.*;

class BallonClass
{

    private int iWidth = 80;
    private int iHeight = 80;
    private int iCentreX = 80;
    private int iCentreY = 80;
    private int iTailLength = 80;
    private int maxWidth = 500;
    private int maxHeight = 500;
    private Color iColour = Color.black;

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


    public void draw (Console c)
    {
	int upperLeftCornerX = iCentreX - (iWidth / 2);
	int upperLeftCornerY = iCentreY - (iHeight / 2);
	c.setColour (iColour);
	c.fillOval (upperLeftCornerX, upperLeftCornerY, iWidth, iHeight);
	c.drawLine (iCentreX, iCentreY + (iHeight / 2), iCentreX, iCentreY + (iHeight / 2) + iTailLength);
    }


    public void erase (Console c)
    {
	Color cOldColour = getColour ();
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


    private void pop (Console c)
    {
	Color cOldColour = getColour ();
	erase (c);
	c.setColour (cOldColour);
	c.drawLine (iCentreX, iCentreY + (iHeight / 2), iCentreX, iCentreY + (iHeight / 2) + iTailLength);
    }


    public void grow (Console c)
    {
	if (iHeight < maxHeight && iWidth < maxWidth)
	{
	    int newWidth = (int) (iWidth * 1.1);
	    setWidth (newWidth);
	    int newHeight = (int) (iHeight * 1.1);
	    setHeight (newHeight);
	    draw (c);
	    delay (500);
	    grow (c);
	}
	else
	{
	    pop (c);
	}
    }


    public void grow (double percentage, Console c)
    {
	if (iHeight < maxHeight && iWidth < maxWidth)
	{
	    int newWidth = (int) (iWidth * percentage);
	    setWidth (newWidth);
	    int newHeight = (int) (iHeight * percentage);
	    setHeight (newHeight);
	    draw (c);
	    delay (500);
	    grow (percentage, c);
	}
	else
	{
	    pop (c);
	}
    }


    public BallonClass ()
    {
	setCenter (0, 0);
	setWidth (0);
	setHeight (0);
	setTailLength (0);
	setColour (Color.white);
    }


    public BallonClass (int newCentreX, int newCentreY, int newWidth, int newHeight, int newTailLength, Color newColour)
    {
	setCenter (newCentreX, newCentreY);
	setWidth (newWidth);
	setHeight (newHeight);
	setTailLength (newTailLength);
	setColour (newColour);
    }


    public boolean isPointInside (int pointX, int pointY)
    {
	float inOrOut = (((pointX - iCentreX) * (pointX - iCentreX)) / ((iWidth / 2) * (iWidth / 2))) + (((pointY - iCentreY) * (pointY - iCentreY)) / ((iHeight / 2) * (iHeight / 2)));

	if (inOrOut <= 1)
	{
	    return true;
	}
	else
	{
	    return false;
	}
    }
}
