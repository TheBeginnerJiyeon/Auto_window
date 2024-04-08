import turtle

screen=turtle

screen.reset()
screen.setworldcoordinates(-50,-7.5,50,7.5)
for _ in range(72):
    turtle.left(10)

for _ in range(8):
    turtle.left(45); turtle.fd(2)   # a regular octagon
turtle.done()