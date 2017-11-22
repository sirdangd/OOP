import Card in "Card.tu"

var oCard : pointer to Card

for i : 1..3

    new oCard

    oCard -> setFaceValue (Rand.Int (1, 13))
    oCard -> setCardCentre (Rand.Int (1, maxx), Rand.Int (1, maxy))
    oCard -> setCardSize (Rand.Int (1, 4))
    oCard -> setMidValue
    
    oCard -> setSuitValue (Rand.Int (1, 4))

    oCard -> draw
    delay(1000)
    oCard -> erase

end for
