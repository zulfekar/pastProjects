#Zulfekar
#Labsheet 4 Question 4
#Weekly wages

print "Weekly wage for Employees"
print
hours=input ("Please Enter the hours for the week ")
wage1=(40*30)+(hours-40)*50
wage2=(hours*30)
print
if hours <=0:
    print "Wrong Input"  
elif hours<=40:
    print "The wage for this Employee is", wage2
elif hours>40:
    print "The wage for this Employee is", wage1

