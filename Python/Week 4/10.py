#Zulfekar
#Labsheet 4 Question 10
#University marks

while 1:
    print
    speed=input ("Enter the speed in km/h: ")
    fine=500+((speed-110)*10)
    
    if speed<0 or speed>300:
        print "Speed should be within 0-300 km/h"
    else:
        if speed<=110:
            print "NO FINE!!"
        elif speed>100 and speed<300:
            print "You have to pay a fine of ", fine

