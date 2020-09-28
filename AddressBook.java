package addBook;
import java.util.Scanner;
import java.util.ArrayList;

public class addressBook {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private long phoneNumber;
	private String email;
	public addressBook(String firstName, String lastName, String address, String city, String state, int zip,
			long phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public class Contacts {

		private ArrayList<addressBook> contactList = new ArrayList<addressBook>();

		public ArrayList<addressBook> getContactList() {
			return contactList;
		}

		public void setContactList(ArrayList<addressBook> contactList) {
			this.contactList = contactList;
		}
		public void addContact(addressBook obj) {
			contactList.add(obj);
		}
	}
	




     public static void main(String[] args) {
//    	 System.out.println("Welcome to Address Book Program");
        Contacts person = new Contacts();
 		int option= 1;
 		System.out.println("Welcome to Address Book Program");
 		Scanner sc = new Scanner(System.in);
 		
 		while(option>0 && option<2) {
 			System.out.println("Enter your option\n1. Add Contact\n2. Exit");
 			option = sc.nextInt();
 			if(option==1) {
 				System.out.println("Enter the details to add contact");
 				System.out.println("Enter First Name");
 				sc.nextLine();
 				String firstName = sc.nextLine();
 				System.out.println("Enter Last Name");
 				String lastName = sc.nextLine();
 				System.out.println("Enter Address");
 				String  address= sc.nextLine();
 				System.out.println("Enter City");
 				String city = sc.nextLine();
 				System.out.println("Enter State");
 				String  state= sc.nextLine();
 				System.out.println("Enter Zip");
 				int  zip= sc.nextInt();
 				System.out.println("Enter Phone Number");
 				long phoneNumber = sc.nextLong();
 				System.out.println("Enter email");
 				sc.nextLine();
 				String email = sc.nextLine();
 				addressBook obj = new addressBook(firstName, lastName, address, city, state, zip, phoneNumber, email);
 				person.addContact(obj);
 			}
 		}
 		sc.close();

 	}

 
		

	}

