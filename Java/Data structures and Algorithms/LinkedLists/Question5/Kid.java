package Question5;
import java.util.Calendar;

public class Kid {
	private static int numKid = 0;
	private int kidID;
	private String surname;
	private String otherNames;
	private String responsiblePartyName;
	private String responsiblePartyTel;
	private String address;
	private Calendar dob;
	
	public Kid(String surname, String otherNames,
		String responsiblePartyName, String responsiblePartyTel, String address, Calendar dob) {
		this.kidID = ++numKid;
		this.surname = surname;
		this.otherNames = otherNames;
		this.responsiblePartyName = responsiblePartyName;
		this.responsiblePartyTel = responsiblePartyTel;
		this.address = address;
		this.dob = dob;
	}
	
	public int getKidID() {
		return kidID;
	}
	public void setKidID(int kidID) {
		this.kidID = kidID;
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getOtherNames() {
		return otherNames;
	}
	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}
	
	public String getResponsiblePartyName() {
		return responsiblePartyName;
	}
	public void setResponsiblePartyName(String responsiblePartyName) {
		this.responsiblePartyName = responsiblePartyName;
	}
	
	public String getResponsiblePartyTel() {
		return responsiblePartyTel;
	}
	public void setResponsiblePartyTel(String responsiblePartyTel) {
		this.responsiblePartyTel = responsiblePartyTel;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Calendar getDob() {
		return dob;
	}
	public void setDob(Calendar dob) {
		this.dob = dob;
	}
	
	public String toString() {
		return "Kid ID: " + kidID + "; Surname: " + surname + "; Other Names: " + otherNames + "; Name of Responsible " +
			"Party: " + responsiblePartyName + "; Tel. no. of Responsible Party: " + responsiblePartyTel + "; Address:" + 
			address + "; Date of Birth: " + dob.get(Calendar.DATE) + "/" + (dob.get(Calendar.MONTH) + 1) + "/" + dob.get(Calendar.YEAR);
	}
} // end class Kid