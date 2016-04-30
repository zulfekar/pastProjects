package Question5;
import java.util.*;

public class Smileykindergarten {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int choice;
		LinkedList<Kid> myList = new LinkedList<Kid>();
		String surname;
		String otherNames;
		String responsiblePartyName;
		String responsiblePartyTel;
		String address;
		Calendar dob;
		int date, year,month; 
		
		while(true){
			System.out.println("*****************************************");
			System.out.println("* Smiley Kindergarten Management System *");
			System.out.println("*****************************************");
			System.out.println("1.Register a kid ");
			System.out.println("2.Deregister a kid");
			System.out.println("3.Display details of kids in order of registration");
			System.out.println("4.Search for Kid accordin to name");
			System.out.println("5.List ok Kid living in specific region");
			System.out.println("6.List of kids born in specific month");
			System.out.println("0.Exit");
			System.out.println("*****************************************");
			
			System.out.print("Please Enter Choice: ");
			choice = sn.nextInt();
			System.out.println();
			
			if(choice==0){
				break;
			}
			
			else if(choice==1){
				System.out.print("Enter details of the kid to register\n");
				System.out.print("Please Enter Surname: ");
				surname = sn.next();
				System.out.print("Please Enter OtherNames: ");
				otherNames= sn.next();
				System.out.print("Please Enter Responsible Party Name: ");
				responsiblePartyName = sn.next();
				System.out.print("Please Enter Responsible Party Tel: ");
				responsiblePartyTel = sn.next();
				System.out.print("Please Enter Address: ");
				address = sn.next();
				System.out.print("Please Enter DOB: ");
				date = sn.nextInt();
				month = sn.nextInt();
				year = sn.nextInt();
				dob = Calendar.getInstance();
				dob.set(Calendar.DATE, date);
				dob.set(Calendar.MONTH, month);
				dob.set(Calendar.YEAR, year);
				
				myList.add(new Kid(surname,otherNames,responsiblePartyName,responsiblePartyTel, address, dob));
				System.out.println("Kid successfully registered");
			}
					
			else if(choice==2){
				System.out.println();
				System.out.print("Please enter the ID of Kid to deregister: ");
				int delete = sn.nextInt();
				for(int i=0;i<myList.size();i++){
					if(delete == myList.get(i).getKidID()){
						myList.remove(i);
					}
				}
			}
			
			else if(choice == 3){
				System.out.print("List of kids in order of registration: \n");
				for(int i=0;i<myList.size();i++){
					System.out.println(myList.get(i));
					}
			}
			
			else if(choice == 4){
				System.out.print("Please enter name of kid to search for: ");
				String name = sn.next();
				for(int i=0;i<myList.size();i++){
					if(name.equals(myList.get(i).getOtherNames())){
						System.out.println(myList.get(i));	
					}
				}
			}
			
			else if(choice==5){
				int count = 0;
				System.out.print("Please enter specific region: ");
				String region = sn.next();
				for(int i=0;i<myList.size();i++){
					if(region.equals(myList.get(i).getAddress())){
						count++;
						System.out.println(myList.get(i).getOtherNames()+ " " + myList.get(i).getSurname());	
					}
				}
				if(count==0)
					System.out.println("No kid found in that region ");
			}
			
			else if(choice==6){
				Calendar specificMonth = Calendar.getInstance();
				System.out.println("Please enter specific dob: ");
				int monthKid = sn.nextInt();
				specificMonth.set(Calendar.MONTH, monthKid);
				
				int count = 0;
				for(int i=0;i<myList.size();i++){
					if(specificMonth==myList.get(i).getDob()){
						System.out.println(myList.get(i));	
						count++;
					}
				}
				if(count==0)
					System.out.println("No kid found for that dob ");
			}	
		}
		System.out.println(myList);
	}
}
