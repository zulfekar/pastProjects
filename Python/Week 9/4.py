#Zulfekar
#Labsheet 9 Question 4

#input:input data limit and data to list
#output:print smallest and largest element of the list
#description:
#add data input to the list
#sort list to print smallest element
#reverse list to print largest element

#pseudocode:
#initialise list
#input data limit
#input data
#add data input to list until limit=x
#sort list
#print smallest element
#reverse list
#print largest element

#code:

mylist=[]

x=input ("Enter limit of data: ")
for i in range(x):
    n=raw_input("Enter data: ")
    mylist.append(n)
print mylist
print
mylist.sort()
print "Smallest number is ", mylist[0]
mylist.reverse()
print "Largest number is ", mylist[0]


