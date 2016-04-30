package Question4;
import java.util.*;
public class Broker {
	double size;
	double charges;
	
	public double calculateCharge(double size){
		if(size<2500){
			charges=30+((1.7/100)*size);
		}
		else if(size>=2500 && size<6250){
			charges=56+((0.66/100)*size);
		}
		else if(size>=6250 && size<20000){
			charges=76+((0.34/100)*size);
		}
		else if(size>=20000 && size<50000){
			charges=100+((0.22/100)*size);
		}
		else if(size>=50000 && size<500000){
			charges=155+((0.11/100)*size);
		}
		else{
			charges=255+((0.09/100)*size);
		}
		return charges;
	}
		
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter Transaction Size: ");
		double size=sn.nextInt();
		
		Broker b=new Broker();
		System.out.println("Charges: "+b.calculateCharge(size));

	}

}



