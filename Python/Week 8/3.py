#Zulfekar
#Labsheet 8 Question 3

#input:input n where n is the nth fibonacci number
#output:the value of nth
#description:each number is the sum of the previous 2 numbers

#pseudocode:
#input nth fibonacci number
#initialise f1 
#initialise f2
#f3=f1+f2
#initialise counter 
#print f1 f2 f3
#while true f1=f2,f2=f3,f3=f1+f2
#increment counter until nth
#print nth

#code:

f1=1
f2=1
f3=f1+f2
counter=3

n=input ("Enter a positive number: ")

print f1
print f2
print f3

while 1:
    f1=f2
    f2=f3
    f3=f1+f2
    print f3
    counter=counter+1

    if counter ==n:
        print "The", n,"th number of the fibonacci is",f3
        break 
