import Spaceship in "Spaceship.tu"

var oSpaceship : pointer to Spaceship

new oSpaceship

oSpaceship -> setCentre(Rand.Int(1, maxx), Rand.Int(1, maxy))
oSpaceship -> draw
oSpaceship -> slideTo(100,200)
