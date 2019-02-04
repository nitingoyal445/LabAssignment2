import java.util.Scanner;
public class Person {

	/**
	 * @param firstName
	 * @param lastName
	 * @param gender
	 */
	public Person(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	/**
	 * 
	 */
	public Person() {
		super();
	}
	private String firstName;
	private String lastName;
	private String phno;
	private Gender gender;
	
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
	
	
	void phoneNumber(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Phone Number");
		
		phno=sc.nextLine();
		
	}

	void showAll() {
		Scanner sc=new Scanner(System.in);
		phoneNumber();
		System.out.println("First Name: "+getFirstName());
		System.out.println("Last Name: "+getLastName());
		System.out.println("Gender: "+getGender());
		System.out.println("Phone Number "+ phno);
	}
	
}
