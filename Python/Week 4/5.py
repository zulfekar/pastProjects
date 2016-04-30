#Zulfekar
#Labsheet 4 Question 5
#Baby-Sitting Charges

print "Baby-Sitting Charges"
start=input ("Please Enter Time of Entrance in Hour(Ex:8 for 08.00) ")
finish=input ("Please Enter Time of Leaving in Hour(Ex:22 for 22.00) ")
print
if (start<=21) and (finish<=21):
    charges=(finish-start)*250
elif (start>21) and (finish>21):
    charges=(finish-start)*175
else:
    charges=(21-start)*250+(finish-21)*175
print "The Baby-Sitting Bill is", charges
print
print "Thank You"

