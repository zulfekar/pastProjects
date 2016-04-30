#Zulfekar
#Labsheet 6 Ques 5.a
#function to return sqaure and cube of n

import math
def squarecube(n):
    return n**2,n**3

n=input("Enter a number ")
r2,r3=squarecube(n)

A=(4)*(math.pi)*(r2)
V=(4/3)*(math.pi)*(r3)
print A,V

