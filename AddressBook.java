package addBook;
import java.util.Scanner;
import java.util.ArrayList;

public class addressBook {
	String first_name;
	String last_name;
	String address;
	String city;
	String state;
	int zip;
	int phNum;
	String email;
	addressBook(String first_name,String last_name,String address,String city,String state,
	int zip,int phNum,String email){
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phNum = phNum;
		this.email = email;	
		}

	public void setfName(String first_name) {
		this.first_name = first_name;
	}
	public void setlName(String last_name) {
		this.last_name = last_name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public void setPhnNum(int phNum) {
		this.phNum = phNum;
	}
	public String getfName() {
		return this.first_name;
	}
	public String getlName() {
		return this.last_name;
	}
	public String getAddress() {
		return this.address;
	}
	public String getCity() {
		return this.city;
	}
	public String getState() {
		return this.state;
	}
	public int getZip() {
		return this.zip;
	}
	public int getphnNum() {
		return this.phNum;
	}
	public String getEmail() {
		return this.email;
	}
	public static void editContact(String name) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> editedContact = new ArrayList<String>();
		System.out.println("New Address:");
		String address3 = sc.nextLine();
		editedContact.add(address3);
		System.out.println("New City:");
		String city3 = sc.nextLine();
		editedContact.add(city3);
		System.out.println("New State:");
		String state3 = sc.nextLine();
		editedContact.add(state3);
		System.out.println("New Zip:");
		int zip3 = sc.nextInt();
		String Zip3 = String.valueOf(zip3);
		editedContact.add(Zip3);
		System.out.println("New Phone Number:");
		int phNum3 = sc.nextInt();
		String PhNum3 = String.valueOf(phNum3);
		editedContact.add(PhNum3);
		System.out.println("New Email:");
		String email3 = sc.next();
		editedContact.add(email3);
		System.out.println("The Edited Contact is");
		for(String i:editedContact) {
			System.out.println(i);
		}
		sc.close();
		
		
	}
     public static void main(String[] args) {
		addressBook obj = new addressBook("csd","csdc","cwdc","wfca","cda",9,0,"wcs");
		Scanner sc=new Scanner(System.in);
		System.out.println("First Name:");
		String first_name = sc.nextLine();
		System.out.println("Last Name:");
		String last_name = sc.nextLine();
		System.out.println("Address:");
		String address = sc.nextLine();
		System.out.println("City:");
		String city = sc.nextLine();
		System.out.println("State:");
		String state = sc.nextLine();
		System.out.println("Zip Code:");
		int zip = sc.nextInt();
		System.out.println("Phone Number:");
		int phNum =sc.nextInt();
		System.out.println("Email:");
		String email=sc.next();
		obj.setfName(first_name);
		obj.setlName(last_name);
		obj.setAddress(address);
		obj.setCity(city);
		obj.setState(state);
		obj.setZip(zip);
		obj.setPhnNum(phNum);
		obj.setEmail(email);
		System.out.println(obj.getfName());
		System.out.println(obj.getlName());
		System.out.println(obj.getAddress());
		System.out.println(obj.getCity());
		System.out.println(obj.getState());
		System.out.println(obj.getZip());
		System.out.println(obj.getphnNum());
		System.out.println(obj.getEmail());
		System.out.println("Name of the Contact you want to edit");
		String NameReq = sc.next();
		System.out.println(NameReq);
		editContact(NameReq);
		sc.close();
		

	}

