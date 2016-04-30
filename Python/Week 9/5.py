#Zulfekar
#Labsheet 9 Question 5

#input:input student limit, student name and marks in maths and physics to list
#output:print queried student name and marks in maths and physics
#description:
#after input,query student
#obtain the index of the queried student
#find corresponding marks in maths and physics

#pseudocode:
#initialise student list
#initialise maths list
#initialise physics list
#input data limit
#input data to lists
#add data input to lists until limit=x
#input student name to query
#obtain student index
#obtain marks in maths and physics for the index
#print student name+marks in maths+marks in physics

#code:

namelist=[]
mathslist=[]
physicslist=[]

x=input ("Enter the number of students: ")
print
for i in range(x):
    n=raw_input ("Enter name of student: ")
    namelist.append(n)
    print
    m=input ("Enter maths's marks: ")
    mathslist.append(m)
    print
    p=input ("Enter physics's marks: ")
    physicslist.append(p)
        
print namelist
print mathslist
print physicslist
print
s=raw_input("Whose name do you wish to check? ")
print
i=namelist.index(s)
print s, "has scored", mathslist[i],"in Maths and", physicslist[i],"in Physics."



