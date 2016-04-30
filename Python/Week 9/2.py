#Zulfekar
#Labsheet 9 Question 2

#input:input data limit and data to 2 lists
#output:print sum of the 2 lists
#description:add data input to its list and print sum of both lists

#pseudocode:
#initialise list A and B
#initialise sum
#input limit
#input data
#add data input to list until limit=x
#sum=list A+list B
#print sum

#code:

listA=[]
listB=[]
sum=0
x=input ("How many numbers do you want in each list? ")
for i in range(x):
    n1=input("Enter numbers for A ")
    listA.append(n1)
    n2=input("Enter numbers for B ")
    listB.append(n2)
print listA, listB

for i in range(x):
    a=listA[i]
    b=listB[i]
    sum=sum+a+b
print sum



