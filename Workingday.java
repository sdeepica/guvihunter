package hunter;
import java.util.Scanner;
public class Workingday {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		switch(n) {
		case "sunday":
			System.out.println("false");
			break;
			default:
				System.out.println("true");
		}
		s.close();
	}

}
