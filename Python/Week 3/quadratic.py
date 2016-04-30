#Zulfekar
#quadratic.py
# A program that computes the real roots of a quadratic equation
# Note: This program crashes if the equation has no real roots.

import math
print "This program finds the real roots solutions to a quadratic"
print
a,b,c = input ("Please enter the coefficients (a,b,c): ")
discRoot = math.sqrt((b*b) - (4*a*c))
root1 = (-b + discRoot)/(2*a)
root2 = (-b - discRoot)/(2*a)
print
print "The solutions are: ",root1,"and",root2
