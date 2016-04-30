#Zulfekar
#Labsheet 2 Question 7
#Distance between two points

import math
x1=input ("Enter co-ordinate of x1 ")
y1=input ("Enter co-ordinate of y1 ")
x2=input ("Enter co-ordinate of x2 ")
y2=input ("Enter co-ordinate of y2 ")
print
print "The two co-ordinates on the Line are (",x1,";",y1,") and (",x2,";",y2,")"
print
distance=math.sqrt(((x2-x1)**2) + ((y2-y1)**2))
print "The distance between the two points is", distance
