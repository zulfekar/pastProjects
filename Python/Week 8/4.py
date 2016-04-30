#Zulfekar
#Labsheet 8 Question 4

#input1:enter choice to enter new screen-number 1 or 2 or 3 or 0
#input2:enter number for each choice
#output1:screen 1 for the Sum of the first n counting numbers
#output2:screen 2 for the Sum of the first n odd numbers
#output3:screen 3 for the number of times a whole number can be divided by 2 til 1
#description:runs a function each time a choice is entered

#pseudocode:
#define function for main menu
#define function for choice 1,2 and 3
#for choice 1-input limit
#print accumulating sum til limit
#for choice 2-input limit
#print accumulating sum of odd numbers til limit
#for choice 3-input limit
#print number of times limit is divisible by 2
#if choice=0 then break

#code:

def one():
    print
    counter=1
    sum=0

    n=input("Enter number: ")

    while counter<=n:
        sum=sum+counter
        counter=counter+1
    print "Sum is ",sum
    print

def two():
    print
    counter=1
    sum=0

    n=input("Enter number: ")

    while counter<=n:
        sum=sum+counter
        counter=counter+2
    print "Sum is ",sum
    print

def three():
    print
    counter=0

    n=input("Enter number: ")

    while n>1:
        n=n/2
        counter=counter+1
    
    print counter,"times."
    print


def main():
    while 1:
        print
        print"**********************************"
        print"********Counting in Maths*********"
        print"**********************************"
        print"1.Sum of first n counting numbers"
        print"2.Sum of first nth odd numbers"
        print"3.Number of division by two"
        print"0.Exit"
        print"**********************************"
        choice=input("Enter choice: ")
        print

        if choice==1:
            one()
        elif choice==2:
            two()
        elif choice==3:
            three()
        elif choice==0:
            break
        else: print "\nWrong choice"
        

main()
        
