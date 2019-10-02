class Rectangle:
    def __init__(self, side1, side2):
        self.side1 = side1
        self.side2 = side2
    def getArea(self):
        return self.side1*self.side2
    def __str__(self):
        return "rectangle ({}, {})".format(self.side1, self.side2)

class Square(Rectangle):
    def __init__(self, side):
        super().__init__(side, side)
        self.side = side
    def __str__(self):
        return "square: ({})".format(self.side)

rec = Rectangle(5,10)
print(rec , rec.getArea())

rec = Square(5)
print(rec, rec.getArea())