unit
class Card
    inherit MShapes in "MShapes.tu"
    import Diamond in "Diamond.tu", Heart in "Heart.tu", Club in "Club.tu", Spade in "Spade.tu"
    export setFaceValue, setCardColour, setCardCentre, setCardSize, getCardSize, setSuitValue, getSuitValue, getMidValueY, getMidValueX, setMidValue

    proc setFaceValue (cardValue : int)

	if cardValue >= 1 and cardValue <= 13 then

	    FaceValue := cardValue

	else

	    put "Invalid Face Value"
	    FaceValue := -1

	end if


    end setFaceValue

    fcn getfaceValue : int

	result FaceValue

    end getfaceValue


    proc setCardColour (ipColour : int)

	iColour := ipColour

    end setCardColour

    function getCardColour : int
	result iColour
    end getCardColour

    proc setCardCentre (x, y : int)

	iCentreX := x
	iCentreY := y


    end setCardCentre


    proc setCardSize (cardSize : int)

	if cardSize = 1 then

	    CardHeight := 60

	elsif cardSize = 2 then

	    CardHeight := 80

	elsif cardSize = 3 then

	    CardHeight := 100

	elsif cardSize = 4 then

	    CardHeight := 120

	end if


    end setCardSize

    function getCardSize : int
	result CardHeight
    end getCardSize

    proc setSuitValue (suitValue : int)
	iSuitValue := suitValue
    end setSuitValue

    function getSuitValue : int
	result iSuitValue
    end getSuitValue

    proc setMidValue
	midValX := iCentreX + floor (CardHeight * 0.7)
	midValY := iCentreY + CardHeight
    end setMidValue

    function getMidValueX : int
	var answerX : int := (iCentreX + midValX) div 2
	result answerX
    end getMidValueX

    function getMidValueY : int
	var answerY : int := (iCentreY + midValY) div 2
	result answerY
    end getMidValueY

    body proc draw

	var x2, y2, midx, midy, ascent, descent, internalleading, externalleading : int

	var font : int
	var fontSize : string
	fontSize := intstr (floor (CardHeight * 0.2))
	font := Font.New ("serif:" + fontSize)
	assert font > 0

	var oDiamond : pointer to Diamond
	var oHeart : pointer to Heart
	var oSpade : pointer to Spade
	var oClub : pointer to Club

	new oDiamond
	new oHeart
	new oSpade
	new oClub
	if faceUp = true then
	    if getSuitValue = 1 then
		if iColour not= colourbg then
		    setCardColour(red)
		end if
		oDiamond -> setCentre (getMidValueX, getMidValueY)
		oDiamond -> setHeight (floor (CardHeight * 0.25))
		oDiamond -> setWidth (floor ((CardHeight * 0.25) * (4 / 5)))
		oDiamond -> draw
	    elsif getSuitValue = 2 then
		if iColour not= colourbg then
		    setCardColour (black)
		end if
		oClub -> setCentre (getMidValueX, getMidValueY)
		oClub -> setHeight (floor (CardHeight * 0.25))
		oClub -> setWidth (floor ((CardHeight * 0.25) * (4 / 5)))
		oClub -> draw
	    elsif getSuitValue = 3 then
		if iColour not= colourbg then
		    setCardColour (red)
		end if
		oHeart -> setCentre (getMidValueX, getMidValueY)
		oHeart -> setHeight (floor (CardHeight * 0.25))
		oHeart -> setWidth (floor ((CardHeight * 0.25) * (4 / 5)))
		oHeart -> draw
	    elsif getSuitValue = 4 then
		if iColour not= colourbg then
		    setCardColour (black)
		end if
		oSpade -> setCentre (getMidValueX, getMidValueY)
		oSpade -> setHeight (floor (CardHeight * 0.25))
		oSpade -> setWidth (floor ((CardHeight * 0.25) * (4 / 5)))
		oSpade -> draw
	    else
		put "DNE"
	    end if

	    x2 := floor (iCentreX + (0.7 * CardHeight))
	    y2 := iCentreY + CardHeight

	    Draw.Box (iCentreX, iCentreY, x2, y2, iColour)

	    if FaceValue = 1 then

		Font.Draw ("A", iCentreX + 10, y2 - strint (fontSize), font, iColour)

	    elsif FaceValue = 11 then

		Font.Draw ("J", iCentreX + 10, y2 - strint (fontSize), font, iColour)

	    elsif FaceValue = 12 then

		Font.Draw ("Q", iCentreX + 10, y2 - strint (fontSize), font, iColour)

	    elsif FaceValue = 13 then

		Font.Draw ("K", iCentreX + 10, y2 - strint (fontSize), font, iColour)


	    else
		Font.Draw (intstr (FaceValue), iCentreX + 10, y2 - strint (fontSize), font, iColour)
	    end if


	    midx := (iCentreX + x2) div 2
	    midy := (iCentreY + y2) div 2
	end if
	else 
	    
	    


    end draw

end Card


