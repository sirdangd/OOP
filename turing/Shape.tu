unit
class Shape
    export setColour, setHeight, setWidth, setCentre, setValue, getColour, draw, erase
    
    var iColour, iHeight, iWidth, iCentreX, iCentreY, iDieValue, numSteps, Delay, newx, newy, CardHeight, FaceValue, iSuitValue, midValX, midValY : int := 20

    function getColour : int
	result iColour
    end getColour  
    
    function getx : int
	result iCentreX
    end getx
    
    function gety : int
	result iCentreY
    end gety
    
    deferred proc draw
    
    proc erase
	var iOldColor : int := getColour
	iColour := colorbg
	draw
	iColour := iOldColor
    end erase 
    
    proc setColour (ipColour : int)
	iColour := ipColour
    end setColour

    proc setHeight (ipHeight : int)
	iHeight := ipHeight
    end setHeight

    proc setWidth (ipWidth : int)
	iWidth := ipWidth
    end setWidth

    proc setCentre (ipCentreX, ipCentreY : int)
	iCentreX := ipCentreX
	iCentreY := ipCentreY
    end setCentre  
    
    proc setValue (ipDieValue : int)  
	iDieValue := ipDieValue
    end setValue
end Shape
