import java.util.Scanner;
public class PersonMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Person p= new Person("Nitin","Goyal");
		p.setGender(Gender.M);
		
		p.showAll();
		
		
		

	}

}
