#Zulfekar
#Labsheet 9 Question 1

#input:input data to a list
#output:print the list
#description:add data input to the list until moredata=no

#pseudocode:
#initialise list
#initialise moredata to yes
#input data
#add data input to the list until moredata=no
#print list

#code:

mylist=[]
moredata="y"

while moredata=="Y" or moredata=="y":
    n=raw_input("Enter data: ")
    mylist.append(n)
    moredata=raw_input ("Do you have more date? (y/n) ")
    
print mylist


