unit
class Suit
    inherit MShapes in "MShapes.tu"

    body proc setWidth (ipWidth : int)
	iWidth := floor (iHeight * (4 / 5))
    end setWidth

    body proc setHeight (ipHeight : int)
	iHeight := floor (iWidth / (4 / 5))
    end setHeight

end Suit
