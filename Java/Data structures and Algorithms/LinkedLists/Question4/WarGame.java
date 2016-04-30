package Question4;
import java.util.*;
public class WarGame {
	
	public static int getCardNumValue(String card){
		String values = "23456789TAKQJ";
		return values.indexOf(card.charAt(0)) + 1;
	}

	public static int getCardSuitValue(String card){
		String suits = "cdhs";
		return suits.indexOf(card.charAt(1)) + 1;
	}
	
	public static void main(String[] args) {
		List<List<String>> myList=new LinkedList<List<String>>();
		
		int numPlayer;
		int distribution;
		String card;
		int values;
		int suits;
		int n=0;
		
		Scanner sn=new Scanner(System.in);	
		System.out.print("Enter number of players ");
		numPlayer=sn.nextInt();
		sn.nextLine();

		if(52%numPlayer!=0){
			System.out.println("Cards cannot be played by "+numPlayer);
		}
		else{
			distribution=52/numPlayer; //how many cards a player gets
			int[] score=new int[numPlayer];
			for(int i=0;i<numPlayer;i++)
				score[i]=0; //assigns score to 0 for every player
		
			List<String> temp;
			while(n<numPlayer){
				temp=new LinkedList<String>();
				for(int i=0;i<distribution;i++){
					card=sn.next();
					temp.add(card);
				}
				myList.add(temp);
				sn.nextLine();
				n++;
			}//end while
			
			List<String> play;
			String strPlay;
			
			for(int i=0;i<distribution;i++){
				play=myList.get(0);
				strPlay=play.get(i);
				String winCard = strPlay;
				int winPlayer = 0;
				for(int j=1;j<numPlayer;j++){
					play=myList.get(j);
					strPlay=play.get(i);
					if (getCardNumValue(strPlay)>getCardNumValue(winCard)){
						winCard = strPlay;
						winPlayer = j;

					}
					else if(getCardNumValue(strPlay)==getCardNumValue(winCard)){
						if(getCardSuitValue(strPlay)>getCardSuitValue(winCard)){
							winCard = strPlay;
							winPlayer = j;
						}
					}
				}//end for
				score[winPlayer]++;
			}//end for
		
			int winner=0;
			for(int i=1;i<score.length;i++){
				if(score[i]>score[winner]){
					winner=i;
				}
			}
			System.out.println("Player "+(winner+1)+" has won the game!");
		}//end if
	}//end main
}//end class