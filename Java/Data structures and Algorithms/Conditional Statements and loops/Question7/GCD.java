package Question7;
import java.util.*;
public class GCD {

		public static void calculateGCD(int m,int n){
			int modResult;

				while (n % m != 0) {
					modResult = n % m;
					n = m;
					m = modResult;
			}
				System.out.println("The GCD is: "+ m);
			}

	
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter Number1 and Number2 (separated by a space): ");
		int m=sn.nextInt();
		int n=sn.nextInt();
		calculateGCD(m,n);
	}

}
