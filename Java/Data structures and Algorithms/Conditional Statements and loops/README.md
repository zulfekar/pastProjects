Question 1:

Write a programme that accepts three integers as input, compares them and prints the largest integer
as output. Modify your programme to print the minimum integer as output.

Question 2:

simple conditional statement.

Question 3:

Suppose you want to write a programme that outputs the following depending on your GPA
GPA Message output
Greater than 4 Great
Between 3 and 4 Good
Between 2 and 3 Average
Lower than 2 Need to work harder
Write the above programme using if statements. Rewrite your programme using conditional
expression.

Question 4:

When stocks are sold or purchased through a broker, the broker's commission is often computed
using a sliding scale that depends upon the value of the stocks traded. Let's say that a broker charges
the amounts shown in the following table:
Transaction Size Commission rate
Under $2,500 $30 + 1.7%
$2,500 - $6,250 $56 + 0.66%
$6,250 - $20,000 $76 + 0.34%
$20,000 - $50,000 $100 + 0.22%
$50,000 - $500,000 $155 + 0.11%
Over $500, 000 $255 + 0.09%
The minimum charge is $39. Our program asks the user to enter the amount of the trade, then
displays the amount of the commission:
Sample run for the program is as follows:
Enter value of trade: 30000
Commission: $166.00

Question 5:

Using the switch statement, write a program that converts a numerical grade into a letter grade:
Enter numerical grade: 84
Letter grade: B

Use the following grading scale: A = 90-100, B=80-89, C=70-79, D=60-69, F=0-59. Print an error
message if the grade is larger than 100 or less than 0.
Hint: Break the grade into two digits, then use a switch statement to test the ten's digit.

Question 6:

Write a program that asks the user for a two digit number, then prints the English word for the number:
Enter a two-digit number: 45
You entered the number forty-five.
Hint: Break the number into two digits. Use one switch statement to print the word for the first digit
(“twenty”, “thirty” and so forth). Use a second switch statement to print the word of the second digit.
Don't forget that the number between 11 and 19 require special treatment.
The following questions require that you use loops to answer them.

Question 7:

Write a program that asks the user to enter two integers, then calculates and displays their greatest
common divisor (GCD):
Enter two integers: 12 28
Greatest common divisor: 4
Hint: The classic algorithm for computing the GCD, known as Euclid's algorithm, goes as follows: Let
m and n be variables containing the two numbers. Divide m by n. Save the divisor in m, and save the
remainder in n. If n is 0, then stop: m contains the GCD. Otherwise, repeat the process, starting with
the division of m by n.

Question 8:

Write a program that asks the user to enter a fraction, then converts the fraction to lowest terms:
Enter numerator of fraction: 6
Enter denominator of fraction: 12
In lowest terms 6/12 is: 1/2
Hint: To convert a fraction to lowest terms, first compute the GCD of the numerator and denominator.
Then divide both the numerator and denominator by the GCD.

Question 9:

Write a program that determines the number of digits in a string input by the user.
Sample run for the program is as follows:
Enter a string: Ab37a4z
Ab37s4z has 3 digits

Question 10:

Write a programme that will take a string (all lower case) and output the smallest character. Interprete
your results if now you mix cases for the characters entered.

Question 11:

Write a program that prints a one-month calendar. The user specifies the number of days in the month
and the day of the week on which the month begins:
Enter number of days in month: 31
Enter starting day of the week (1=Sun, 7=Sat) : 3
1 2 3 4 5
6 7 8 9 10 11 12
13 14 15 16 17 18 19
20 21 22 23 24 25 26
27 28 29 30 31

Hint: The most important part is a for statement that uses a variable i to count from 1 to n, where n is
the number of days in the month, printing each value of i. Inside the loop, an if statement tests whether
i is the last day in a week; if so, it prints a new-line character.
