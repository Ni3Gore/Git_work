import java.util.Scanner;

class College{
	static int a = 50;
	Scanner sc = new Scanner(System.in);
	String []b = new String[4];
	void display() {
		
		for(int i = 0; i<b.length; i++) {
			System.out.print("Enter your Name: ");
			String a = sc.next();
			System.out.print("Enter your Sername: ");
			String c = sc.next();
			b[i] = "Name: "+ a + "\n" + "Sername: " + c;

		}
		
		System.out.println(b[2]);
	}
}





public class StaticInJava {

	public static void main(String[] args) {
		College c1 = new College();
		c1.display();


	}

}
