Question 1:

You want to implement a small card game to simulate a “bataille” between two players. The game
proceeds as follows:
Each player is dealt 10 cards, and they pile the cards facing down. Taking turns, each player removes
one card from his pile. The points of both cards are awarded to the player with the maximum value. If
the two cards have the same value (e.g. 2C and 2S), each player earns the points from her card ( in
the example 2 points each).
Each time the players draw a card, your programme should display the card of each player. Finally,
the points of both players are to be displayed.
You will need to assign 10 random cards to each player to simulate dealing. However, you will have to
ensure that once a card is dealt, it cannot be chosen again.
A sample run of the desired programme is shown below:

Player 1 played 5S and Player 2 played QC

Player 1 played 2S and Player 2 played 8D

Player 1 played 4S and Player 2 played 9C

Player 1 played 9S and Player 2 played 5H

Player 1 played TH and Player 2 played KD

Player 1 played 7S and Player 2 played AS

Player 1 played 8C and Player 2 played TS

Player 1 played 5D and Player 2 played 2D

Player 1 played AD and Player 2 played 8S

Player 1 played KS and Player 2 played TC


Points for player 1 is 59

Points for player 2 is 93


Question 2:

Modify the above programme, such that in case the two players draw cards with the same value, the
cards are set aside and they draw subsequent cards. The player with the larger card value earns all
the points. In case they draw similar values and their piles become empty, these cards are ignored.
