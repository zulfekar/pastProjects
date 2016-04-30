Question 1

A survey was carried out among the general public in Mauritius to find out which soap opera is the
most popular. They were given the following choices and had to select a single integer value
between 1 and 10, as given below, to denote their favourite soap opera:
1 - Dynasty, 2 – C’est La Vie, 3 – Kyunki Saas Bhi Kabhi Bahu Thi, 4 – Santa Barbara, 5 – The Bold and
the Beautiful, 6 – Melrose Place, 7 – Desperate Housewife, 8 – Family Pride, 9 – Beverly Hills, 10 – For
Poor For Richer.
Write a program that reads the choices of a number of persons (the list is terminated by -1), and
calculates and displays the percentage of persons who has a preference for each of the soap operas.
Your program must also output the most popular soap opera.
Sample Input and Output:
Please enter the choices: 10 2 6 4 7 8 2 3 9 9 2 3 5 6 10 5 1 2 10 2
Percentage of persons having preference for each soap opera:
1 2 3 4 5 6 7 8 9 10
5% 25% 10% 5% 10% 10% 5% 5% 10% 15%
C’est La Vie is the most popular soap opera in Mauritius.


Question 2

An acronym is a word formed by taking the first letters of the words in a phrase and making a word
from them. Write a program that allows the user to type in a phrase and outputs the acronym for
that phrase. Note that the acronym should be all uppercase, even if the words in the phrase are not
capitalized.
Sample Input and Output:
Please enter a phrase: random access memory
Acronym: RAM


Question 3

Numerologists claim to be able to determine a person’s character traits based on the “numeric
value” of a name. The value of a name is determined by summing up the values of the letters of the
name where ’a’ is 1, ’b’ is 2, ’c’ is 3 etc., up to ’z’ being 26. Write a program that calculates the numeric
value of a name provided as input.
Sample Input and Output:
Please enter your name: Simba
The numeric value of your name is 44.

Question 4

Write a program that reads a date in the format dd/mm/yyyy, converts it into a more verbose format
and outputs the result.
Sample Input and Output:
Please enter a date dd/mm/yyyy: 13/07/2011
Date in verbose format: 13th July 2011


Question 5

Many computer systems use a username and password combination to authenticate users. Often,
usernames are derived from the user’s actual name. One scheme for generating usernames is to use
the user’s first initial followed by up to seven letters of the user’s last name. Write a program that
constructs the user name for a user from his/her first name and last name, taken as input.


Sample Input and Output:
Please enter your first name followed by last name: Jonh Macghilleseatheanaich
Your username is jmacghi.
Another Sample Input and Output:
Please enter your first name followed by last name: Simba Smith
Your username is ssmith.


Question 6

Write a program that asks the user to enter his/her first name, followed by the first names of his/her
friends in his/her class. The program must then compute and display the number of students having
the same first name as the user.
Sample Input and Output:
Please enter your first name: Tom
Please enter the first names of your friends: Sam Pam Tom Johnson Tommy Alice Peter Tom
Jeremy
You have 2 friends in your class having the same first name as yours.

Question 7

One of the celebrities of the on-line movement is a fellow named BIFF, who has a unique way of
writing messages. Here’s a typical BIFF communique: H3Y DUD3, C 15 R1LLY C00L!!!!!!!!!!
Write a program that implements a “BIFF filter” that reads a message entered by the user and
translates it into BIFF-speak.
Sample Input and Output:
Enter message: Hey dude, C is rilly cool
In BIFF-speak: H3Y DUD3, C 15 R1LLY C00L!!!!!!!!!!
Your program should convert the message to upper-case letters, substitute digits for certain letters
(A → 4, B → 8, E → 3, I → 1, O → 0, S → 5), and then append ten exclamation marks.
Hint: Store the original message in a String. Then, access each character one by one, translating and
printing it.


Question 8

A Caesar cipher is a simple substitution cipher based on the idea of shifting each letter of the
plaintext message a fixed number (called the key) of positions in the alphabet. For example, if the
key value is 2, ‘a’ will be encoded as ‘c’, ‘b’ as ‘d’, and so on. This approach continues up to ‘x’ which
will be encoded as ‘z’. Then the substitution pattern wraps around so that ‘y’ is encoded as ‘a’ and ‘z’
with ‘a’. The original message can be recovered by “re-encoding” it using the negative of the key.
Write a program that can encode a message using Caesar cipher. The input to the program will be a
string of plaintext and the value of the key. The output will be an encoded message where each
character in the original message is replaced by shifting it key characters in the ASCII character set.
Sample Input and Output:
Original message: Interesting Module
Encoded message: Kpvgtguvkpi Oqfwng
Hint: ASCII value of ‘A’ is 65, ‘B’ is 66, ..., ‘Z’ is 90, ‘a’ is 97, ‘b’ is 98, ... and ‘z’ is 122.


Question 9

A friend of yours has just bought a new computer. Before this, the most powerful machine he ever
used was a pocket calculator. He is a little disappointed because he liked the LCD display of his
calculator more than the screen on his new computer. To make him happy, write a program that
prints numbers in LCD display style.
The input must include two integers, s and n, where n is the number to be displayed and s is the size
in which it shall be displayed. Your program must then print the numbers input in an LCD displaystyle
using s “–” signs for the horizontal segments and s “|” signs for the vertical ones. Each digit
occupies exactly s + 2 columns and 2s + 3 rows. Be sure to fill all the white space occupied by the
digits with blanks. There must be exactly one column of blanks between two digits.




