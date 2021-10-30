package pattern;

public class NumberPattern1 {

	public static void main(String[] args) {
		int num=7,temp=1;
		for(int i=0;i<num;i++) {
			for(int j=num-i;j>=0;j--) {
				System.out.print(" ");
				
			}
			for(int j=0;j<=i;j++) {
			System.out.print(temp);
		}temp++;
			System.out.println(" ");
			}


	}

}
