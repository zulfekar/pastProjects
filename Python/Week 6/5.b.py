#Zulfekar
#Labsheet 6 Ques 5.a&b
#function to return area and volume of sphere

import math

def squarecube(n):
    return n**2, n**3

n=input("Enter a number ")
print squarecube(n)


r=input("Enter radius ")
r2, r3 = squarecube(r)
A=(4*math.pi*r2)
V=(4/3*math.pi*r3)

print "Area and Volume are", A, V,"respectively."





