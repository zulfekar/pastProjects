Question 1

Write a program that reads 2 integer values, start and end, and creates a linked list that stores all
even numbers between start and end, inclusive. Your program must calculate the sum of all the
elements and add it at the end of the linked list, and then display all the elements of the linked
list.

Question 2

Write a program that reads in a sequence of numbers and adds them in ascending order in a
linked list, until the user enters zero. Your program must then stop reading numbers, copy all the
elements of the linked list to a Vector and then display all the elements of the Vector.
Hint: When creating a Vector, it can be ‘initialised’ with elements of a specified collection object.

Question 3

At HyperTasty restaurant, waiters are responsible to (1) take orders from customers to an order
counter, specifying the table ID (an integer value) and (2) serve requested dishes, obtained at the
order counter, to customers. The waiter can also query about the number of orders preceding
the order from a particular table. Hence, a list of orders that have not yet been served to
customers is kept at the order counter. Since different dishes have different preparation times,
the orders may not necessarily be served in the same order that they are received at the order
counter. When the dish(es) for a particular order is ready, it is served by the waiter to the
appropriate table, and the corresponding order is removed from the list of pending orders.

Assuming that only the table ID is kept in the list of orders at the order counter, you are required
to write a program to simulate the above scenario. The four possible commands input to the
program are as described below:
• ‘O num’ implies adding an order from table ID num.
• ‘D num’ implies delivering the order of table ID num.
• ‘Q num’ implies displaying the number of orders received before that of table with table ID
num that have not yet been delivered.
• X will quit the program.

Question 4

A group of children plays a simplified version of the War Game. A standard 52-card deck is dealt
to numPlayer players (where 52 is divisible by numPlayer) such that each player has an equal
number of cards in their deck. The aim of the game is to win the maximum score.
The rules of the game are as follows:
• Each player is given num (i.e. 52/numPlayer) cards.
• Players do not look at their cards.
• Each player will then choose cards from his/her deck, one at a time, in the same order that
the card was given to him/her.
• The card of each player will be compared and the one whose card has the highest value
scores one point. Card values ranked from high to low are J, Q, K, A, T, 9, 8, 7, 6, 5, 4, 3, 2. If two
cards have the same value, the suits are used to determine the card with the highest value.
The suits in increasing order value are Club, Diamond, Heart and Spade.
• When the players have no cards left in their deck, the player with the maximum score wins
the game.
You are required to write a program that determines the winner of a game dealt to numPlayer
players. The input will consist of an integer for numPlayer followed by numPlayer lines each
corresponding to the input deck of one player. The cards are listed in the order in which they are
given to the players and are specified as two-character strings. The first character denotes the
value on the card and the second character (lowercase) denotes the suit. As such, the value 10 is
denoted by the character ‘T’. Your program must continuously read in values for numPlayer and
cards in the deck of each player until the user enters the value zero for numPlayer. In case 52 is
not divisible by the value entered for numPlayer, a message must be given to the user.


Question 5

You have been hired to implement a management system for Smiley kindergarten that will keep
record of all its registered kids. As part of the system, you are required to implement a program
that will create a list of kids registered at Smiley kindergarten, i.e. store the ID, surname, other
names, name of responsible party, telephone number of responsible party, address and date of
birth of each kid, and allow the user to manipulate the list. Records of kids will be kept in order in
which the kids are registered.
Your program must display the following menu and allow the user to iteratively perform each of
the tasks, until he/she enters 0.

**********************************************
* Smiley Kindergarten Management System *
**********************************************
* 1. Register a kid *
* 2. Deregister a kid *
* 3. Display details of kids in order of registration *
* 4. Search for kid according to name *

* 5. List of kids living in a specific region *
* 6. List of kids born in a specific month *
* 0. Exit *
**********************************************

Please enter your choice:
The following describes each of the options in the menu:
1. Add details of a kid to the linked list.
2. Delete details of a kid from the linked list.
3. Display details of all registered kids at Smiley Kindergarten in order of registration.
4. Search for details of a particular kid, given his/her surname and other names. If details of the
kid do not exist in the list, your program must display “This kid is not registered at Smiley
Kindergarten!”
5. Display details of all kids living in a specific region, e.g. all kids living at Reduit.
6. Display details of all kids born in a particular month, e.g. all kids born in March.
