unit
class MShapes
    inherit Shape in "Shape.tu"
    export newCoords, getSteps, getDelay, setSteps, setDelay, slideTo

    function getSteps : int
	result numSteps
    end getSteps

    proc newCoords (x, y : int)
	newx := x
	newy := y
    end newCoords
    
    proc setSteps (numOfSteps : int)
	numSteps := numOfSteps
    end setSteps

    function getDelay : int
	result Delay
    end getDelay

    proc setDelay (numOfDelay : int)
	Delay := numOfDelay
    end setDelay

    proc slideTo (newx, newy : int)
	
	
	const dx := (newx - getx) div numSteps
	const dy := (newy - gety) div numSteps

	for i : 1 .. numSteps - 1
	    draw
	    delay (Delay)
	    erase
	    setCentre (getx + dx, gety + dy)
	end for
	erase
	setCentre (newx, newy)
	draw
    end slideTo

end MShapes
