package hunter;

public class reversewords {
	public static void main(String[] args) {
		String s="hello world";
		String[] arr=s.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
		   System.out.print(arr[i]+" ");
		}
	}
	}

