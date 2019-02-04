import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String firstName;
		String lastName;
		String gender;
		int age;
		double weight;
		System.out.println("Enter First Name");
		firstName=sc.nextLine();
		System.out.println("Enter Last Name");
		lastName=sc.nextLine();
		System.out.println("Enter Gender M/F");
		gender=sc.next();
		System.out.println("Enter Age");
		age=sc.nextInt();
		System.out.println("Enter Weight");
		weight=sc.nextInt();
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Weight: "+weight);
		

	}

}
