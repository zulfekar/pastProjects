#Zulfekar
#Labsheet 6 Ques 2
#function to show the smaller number

def smaller(number1,number2):
    if number1<number2:
        return number1
    else:
        return number2

number1=input("Enter number 1 ")
number2=input("Enter number 2 ")
print "Answer is", smaller(number1,number2)
