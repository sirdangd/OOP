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
    private char stringDirection[] = {"N", "E", "S", "W"}; 

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

	c.setColor (cColor);
	if (filled)
	{
	    c.fillPolygon (iPointsX, iPointsY, 4);
	}
	else
	{
	    c.drawPolygon (iPointsX, iPointsY, 4);
	}
    }
    public void rotate (Console c)
    {
	iWidth = iHeight;
	iHeight = iWidth;
	draw(c)
    }
}
