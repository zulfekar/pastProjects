package Question10;
import java.util.*;
public class Minesweeper {
	public static void main(String[] args) {
		Scanner scanIn=new Scanner(System.in);
		int numRows,numColumns,countMines;
		String row;
		int fieldNum=0;
		char[][] mines,numMines;
		
		numRows=scanIn.nextInt();
		numColumns=scanIn.nextInt();
		
		while(numRows!=0 && numColumns!=0){
			//read details of field
			mines=new char[numRows+2][numColumns+2];
			for(int j=0;j<mines.length-2;j++){
				row=scanIn.next();
				for(int i=0;i<mines[j].length-2;i++){
					mines[j+1][i+1]=row.charAt(i); //save the input into mines starting [1][1]
				}//end for i
			}//end for j
			
			numMines=new char[numRows+2][numColumns+2];
			for(int j=1;j<mines.length-1;j++){ //index 1,2,3,4
				for(int i=1;i<mines[j].length-1;i++){
					if(mines[j][i]=='*'){
						numMines[j][i]='*';
					}
					else{
						countMines=0;
						for(int k=j-1;k<=j+1;k++){
							for(int l=i-1;l<=i+1;l++){
								if(mines[k][l]=='*'){
									countMines++;
								}//end if
							}//end for l
						}//end for k
						numMines[j][i]=Integer.toString(countMines).charAt(0);
					}//end if
				}//end for i
			}//for for j
			fieldNum++;
			System.out.println("Field# "+fieldNum);
			for(int i=1;i<numMines.length-1;i++){
				for(int j=1;j<numMines[i].length-1;j++){
					System.out.print(numMines[i][j]);
				}//end for j
				System.out.println();
			}//end for i
			numRows=scanIn.nextInt();
			numColumns=scanIn.nextInt();
		}//end while
	}//end main
}//end class Minesweeper
