#Zulfekar
#Labsheet 4 Question 9
#University marks

marks=input ("Please Enter the Exam Score ")
if (type(marks) is float) or (type(marks) is int):
    if marks<0 or marks>100:
        print "Marks lie between 0 and 100"
    else:
        if marks>=70 and marks<=100:
            print
            print "You are an A Grade Student"
        elif marks>=60 and marks<=69:
            print
            print "You are a B Grade Student"
        elif marks>=50 and marks<=59:
            print
            print "You are a C Grade Student"
        elif marks>=40 and marks<=49:
            print
            print "You are a D Grade Student"
        elif marks>=0 and marks<=39:
            print
            print "You are an F Grade Student"
else:
    print
    print "Marks should be numerical"
