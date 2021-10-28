package basic;

public class MethodOverloading {
 
	public float sum(int i) {
		System.out.println("the number is "+i);
		return 0;
	}
	public int sum(float s,int b) {
		System.out.println("the number is "+s+ " "+b);
		return 0;
	}
	public static void main(String[] args) {
MethodOverloading a=new MethodOverloading(); 
a.sum(10);
	}

}
