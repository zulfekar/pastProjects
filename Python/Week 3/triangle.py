#Zulfekar
#This program will find the hypotenuse of a triangle given the two sides
#triangle.py

print "This program will give you the length of the hypotenuse given the two other sides"
print
import math
side1=input ("Please enter the length of the first side ")
side2=input ("Please enter the lenght of the second side ")
side3=math.sqrt((side1**2)+(side2**2))
print
print "The length of the hypotenuse is", side3
