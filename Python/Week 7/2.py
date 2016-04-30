#Zulfekar
#Labsheet 7 Ques 2
#bank deposit


p=input ("Please Enter Bank Deposit ")
n=input ("Please Enter number of years ")
r=input ("Pleae Enter interest rate ")
count=1
while count<=n:
    p=p+(p*r)
    print "The balance on this Bank Account for Year", count, "is", p
    count=count+1
    
    

