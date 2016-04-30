package Question2;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class CardGame2 {
	public static final int NCARDS = 52; /* number of cards */
	public static final int NSUITS = 4; /* number of suits */
	public static final int NUM_DEALS = 10;
	public static final char values[] = {'2','3','4','5','6','7','8','9','T','J','Q','K','A'};
	public static final char suits[] = {'C','D','H','S'};
	
	/**
	* @param value @param suit
	* @return the rank of the card from 051
	* card 2C has value 0, 2D value 1, 2H value 2, 2S value 3,
	* card 3C has value 4, 3D value 5, 3H value 6, 3S value 7,etc
	*/
	public static int rankCard(char value, char suit){
		int i,j;
		for (i=0; i<(NCARDS/NSUITS); i++)
			if (values[i]==value)
				for (j=0; j<NSUITS; j++)
					if (suits[j]==suit)
						return( i*NSUITS + j );
		System.out.println("Warning: bad input value=" + value+ " suit="+suit);
		return 1;
	}
	
	/**
	* Function to return the numeric position of the value of the card:
	* '2' is position 0 and 'A' is position 12
	* @return the int value of the position of the card (012)
	*/
	public static int rankValue(char value){
		for (int i=0; i<(NCARDS/NSUITS); i++)
			if (values[i]==value)
				return i;
		return 1;
	}
	
	//returns the suit given the numeric encoding (051) of a card
	public static char getSuit(int card){
		return( suits[card % NSUITS] );
	}
	

	//returns the value of a card '2' ... 'A' from the numeric encoding (051) of a card
	public static char getValue(int card){
		return( values[card/NSUITS] );
	}
	
	public static void main(String[] args){
		Stack<String> stack = new Stack<String>();
		for(int i=0; i<values.length; i++){
			for(int j=0; j<suits.length; j++){
				char a = getValue(i); //char a = values[i];
				char b = getSuit(j); //char b = suits[j];
				String output = Character.toString(a)+ Character.toString(b);
				stack.push(output);
			}
		}
		
		Collections.shuffle(stack);
			
		Stack<String> stackA = new Stack<String>();
		Stack<String> stackB = new Stack<String>();
		
		//distributing to player 1 Card 0 to 10
		for(int k=0; k<10; k++){
			String input = stack.pop();
			stackA.push(input);
		}
		
		//distributing to player 2 Card 10 to 20
		for(int l=10; l<20; l++){
			String input = stack.pop();
			stackB.push(input);
		}
		int sum1 =0, sum2 = 0;
		int score1 = 0, score2 = 0;
		for(int p=0; p<NUM_DEALS; p++){
			String turn1, turn2;
			turn1= stackA.pop();
			turn2= stackB.pop();
			score1 = rankCard(turn1.charAt(0), turn1.charAt(1));
			score2 = rankCard(turn2.charAt(0), turn2.charAt(1));
			if(score1 == score2){
				System.out.println("Both Cards are the same-->"+turn1+" "+turn2);
				if(!stackA.isEmpty() && !stackB.isEmpty()){
					turn1= stackA.pop();
					turn2= stackB.pop();
					score1 = rankCard(turn1.charAt(0), turn1.charAt(1));
					score2 = rankCard(turn2.charAt(0), turn2.charAt(1));
					if(score1>score2){
						score1 = score1+score2;
						score2 = 0;
					}
					else{
						score2 = score1+score2;
						score1 = 0;
					}
				}
				else{
					break;
				}
			}
			sum1 += score1;
			sum2 += score2;
			System.out.println("Player 1 played "+turn1+" and Player 2 played "+turn2);
		}
		
		System.out.println("Points for player 1 is "+sum1);
		System.out.println("Points for player 2 is "+sum2);
	}//end main
}//end class

