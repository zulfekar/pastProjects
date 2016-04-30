#Zulfekar
#Labsheet 9 Question 3

#input:input data to list
#output:print reverse of list
#description:add data input to the list until moredata=no then reverse 

#pseudocode:
#initialise list
#initialise moredata to yes
#input data
#add data input to list until moredata=no
#reverse list
#print list

#code:

mylist=[]
moredata="y"

while moredata=="Y" or moredata=="y":
    n=raw_input("Enter data: ")
    mylist.append(n)
    moredata=raw_input ("Do you have more date? (y/n) ")
mylist.reverse()
print mylist
