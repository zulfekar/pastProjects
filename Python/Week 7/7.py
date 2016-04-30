#Zulfekar
#Labsheet 7 Question 7
#Output number of years


x=input ("Enter interest rate: ")
r=1+(x/100.0)
n=0
initialamount=input ("Enter initial amount: ")
newamount=initialamount

while newamount/initialamount <2:
    newamount=r*newamount
    n=n+1
print "Number of years is", n


