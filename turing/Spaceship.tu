unit
class Spaceship
    inherit MShapes in "MShapes.tu"
    
    body proc draw
	Draw.FillOval(iCentreX, iCentreY, iWidth, iHeight, iColour)
    end draw
end Spaceship
	
