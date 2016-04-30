#Zulfekar
#Labsheet 8 Question 1

#input:series of number-any type
#output:sum of the series of number
#description:input will stop upon entering 0 and display output

#pseudocode:
#initialise sum
#while true take inputs
#sum=sum+input
#if x=0 then break
#print sum

#code:

sum=0.0
while 1:    #infinite loop
    x=input ("Enter number: ")
    sum=sum+x
    if (x==0):
        break
    
print "Sum is",sum
    
