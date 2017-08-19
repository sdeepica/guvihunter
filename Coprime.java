package hunter;
import java.util.Scanner;
public class Coprime {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int count=0;
		for(int i=2;i<num1/2;i++) {
			if((num1%i)==0) {
				count++;
			}
		}
		for(int i=2;i<num2/2;i++) {
			if((num2%i)==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("it is coprime");
		}
		else {
			System.out.println("it is not a coprime number");
		}
		s.close();
	}

}
