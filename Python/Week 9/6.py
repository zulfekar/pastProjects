#Zulfekar
#Labsheet 9 Question 6

#input:input data to a list
#output:print whether list is symmetrical or not
#description:compare the two halves of the list

#pseudocode:
#initialize list
#while true input data
#if value=finish then exit loop
#else add value to list
#find length of list
#for i in range length/2
#if list(index) is not equal to list(last-index) - 1 then
#print List is not symmetrical
#exit loop
#else List is symmetrical

#codes:

mylist = []

while 1:
    x = raw_input("Enter data >>type 'Finish' to print whether list is symmetrical or not: ")
    if x == "finish" or x == "Finish":
        break
    else:
        mylist.append(x)            
print
print mylist
print

n = len(mylist) 

for i in range(n/2):    
    if mylist[i] != mylist[n-(i+1)]:    
        print " The List is not symmetrical"
        break
    else:
        print "The List is symmetrical"
        break

