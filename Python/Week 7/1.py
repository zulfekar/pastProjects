#Zulfekar
#Labsheet 7 Ques 1
#enter 5 numbers and calculate square root until negative input

import math
 
while 1:
    n1,n2,n3,n4,n5=input("Enter number1, number2, number3, number4, number5: ")
    if n1<0 or n2<0 or n3<0 or n4<0 or n5<0:
        print "No negative numbers allowed"
        break
    else:
        print math.sqrt(n1)
        print math.sqrt(n2)
        print math.sqrt(n3)
        print math.sqrt(n4)
        print math.sqrt(n5)
print "Exiting program"
    


