package Question8;
import java.util.*;
public class Fraction {
	public static void calculateFraction(int m,int n){
		int modResult;
		int oM=m;
		int oN=n;
			while (n % m != 0) {
				modResult = n % m;
				n = m;
				m = modResult;
			}
			System.out.println("The GCD is: "+ m);
			System.out.println("Simple lowest terms "+ oM+"/"+oN+" is: "+oM/m+"/"+oN/m);	
	}

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter numerator of fraction: ");
		int m=sn.nextInt();
		System.out.println("Enter denominator of fraction: ");
		int n=sn.nextInt();
		calculateFraction(m,n);

	}

}

