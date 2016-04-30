#Zulfekar
#Labsheet 6 Ques 4
#function to name and VAT a product


def VAT(price):
    return price*1.15
    
name=raw_input("Enter the name of the product ")
price=input("Enter the price of the product ")
print name,"is at", VAT(price)




