#Zulfekar
#Labsheet 6 Ques 7 & 8
#function for video club

def movie():
    moviename=raw_input ("Enter movie name: ")
    movieduration=raw_input ("Duration of movie: ")
    return

def name():    
    name=raw_input ("Enter customer name: ")
    address=raw_input ("Address: ")
    phone=raw_input ("Phone number: ")
    return

def rental():
    rental=raw_input ("Enter rental transaction: ")
    date=raw_input ("Date: ")
    return



def main():
    while 1:
        print "***************************************"
        print "1 - Add a new movie "
        print "2 - Add a new customer "
        print "3 - Add a rental transaction "
        print
        choice=input("Enter your choice: ")
        print "***************************************"

        if choice==1:
            movie()
        elif choice==2:
            name()
        elif choice==3:
            rental()

main()
        


    

