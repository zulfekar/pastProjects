# factorial.py
# Program to compute the factorial of a number
# Illustrates for loop with an accumulator

import math
n = input ("Please enter a whole number: ")
factorial = 1L
for factor in range(n, 1, -1):
    factorial = factorial * factor
print "The factorial of ", n, " is ", factorial
