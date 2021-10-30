package pattern;

public class PyramidPattern {

	public static void main(String[] args) {
		int num=7;
		for(int i=0;i<7;i++) {
			for(int j=num-i;j>=0;j--) {
			System.out.print(" ");
		}
			for(int j=0;j<=i;j++) {
				System.out.print("*" +" ");
			}System.out.println(" ");

		}

	}

}
