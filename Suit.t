import Diamond in "Diamond.tu", Heart in "Heart.tu", Spade in "Spade.tu", Club in "Club.tu", Die in "Die.tu"

setscreen ("graphics:500,300")


var oDiamond : pointer to Diamond
var oHeart : pointer to Heart
var oSpade : pointer to Spade
var oClub : pointer to Club
var oDie : pointer to Die


new oDiamond
oDiamond -> setCentre(Rand.Int(1, maxx), Rand.Int(1, maxy))


oDiamond -> setWidth(Rand.Int(1, 50))
oDiamond -> setHeight(Rand.Int(1, 50))
var x := Rand.Int(1, maxx)
var y := Rand.Int(1, maxy)
oDiamond -> setDelay(50)
oDiamond -> setSteps(10)
oDiamond -> newCoords(x, y)
oDiamond -> slideTo(x,y)
% 
% 
% new oHeart
% oHeart -> setCentre(Rand.Int(1, maxx), Rand.Int(1, maxy))
% 
% 
% oHeart -> setWidth(Rand.Int(1, 20))
% oHeart -> setHeight(Rand.Int(1, 20))
% oHeart -> draw
% delay(5000)
% oHeart -> erase
% new oSpade
% oSpade -> setCentre(Rand.Int(1, maxx), Rand.Int(1, maxy))
% 
% 
% oSpade -> setWidth(Rand.Int(1, 20))
% oSpade -> setHeight(Rand.Int(1, 20))
% oSpade -> draw
% delay(5000)
% oSpade -> erase
% new oClub
% oClub -> setCentre(Rand.Int(1, maxx), Rand.Int(1, maxy))
% 
% 
% oClub -> setWidth(Rand.Int(1, 20))
% oClub -> setHeight(Rand.Int(1, 20))
% oClub -> draw
% delay(5000)
% oClub -> erase
% 
