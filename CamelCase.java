package hunter;

public class CamelCase {
	public static void main(String[] args) {
		String str="Elephant Is My Favourite Animal";
		String[] arr=str.split(" ");
		int c=0;
		for(String out:arr) {
		int t=(int)out.charAt(0);
		if(t>=65&&t<=90) {
		c++;
		}
		}
		if(c==arr.length) {
			System.out.println("Camel case");
		}
		else {
			System.out.println("Not in camel case");
		}
	}

}
