import Die in "Die.tu"

var oDie : pointer to Die
var dieValue : int
var dieValueSum : int := 0
var dieSize : int

for i : 1..3
    new oDie
    oDie -> setWidth(50)
    dieSize := oDie -> getSize
    oDie -> roll
    dieValueSum += oDie -> getValue
    oDie -> setCentre(Rand.Int(1, maxx), Rand.Int(1,maxy))
    oDie -> draw
    oDie -> setDelay(100)
    oDie -> slideTo(Rand.Int(1, maxx), Rand.Int(1,maxy))
    
    %oDie -> draw

end for
put "Sum of die value: ", dieValueSum
put "Size of die: ", dieSize 
