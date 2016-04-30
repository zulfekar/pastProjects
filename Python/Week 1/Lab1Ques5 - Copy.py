#Zulfekar
#Labsheet 1 Question 5
#Average Score for Student

while 1:
    n=input("Enter number ")
    if n>5:
        print "Average score for this Student"
        Name=raw_input ("Enter name of Student ")
        CSE1010=input ("Enter the score in CSE1010 ")
        CSE1003=input ("Enter the score in CSE1003 ")
        CSEMATH1111=input ("Enter the score in MATH1111 ")
        print "Average score for", Name, "is", (CSE1010+CSE1003+CSEMATH1111)/3
    else:
        break
print "thanks"
