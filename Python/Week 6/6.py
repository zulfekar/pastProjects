#Zulfekar
#Labsheet 6 Question 5
#Weekly wages
    
def wage(hours):
    wage1=(40*30)+(hours-40)*50
    wage2=(hours*30)
    if hours<=40: 
        return wage2
    else:
        return wage1
    
hours=input ("Please Enter the hours for the week ")
print "The wage for this Employee is", wage(hours)


