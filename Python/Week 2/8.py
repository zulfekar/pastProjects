#Zulfekar
#Labsheet 2 Question 8
#Volume of Concrete Required to construct pillar

import math
R=input ("Enter value of Cylinder's Radius, R ")
H=input ("Enter value of Cylinder's Height, H ")
print
R1=input ("Enter value of Smaller Hole's Radius, R1 ")
H1=input ("Enter value of Smaller Hole's Height, H1 ")
print
R2=input ("Enter value of Bigger Hole's Radius, R2 ")
H2=(H-H1)
print "H2=", H2
print
VH=(math.pi*R1*R1*H1)+(math.pi*R2*R2*H2)
VR=(math.pi*R*R*H)-VH
print "Volume of Concrete required is", VR
