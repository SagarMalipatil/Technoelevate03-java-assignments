package basic;

public class DecendingBubbleSort {

	public static void main(String[] args) {
		int temp=0;
	int arr[]= {10,30,25,20,9};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
		
		if(arr[i]<arr[j]) {
			temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
	
	}
		System.out.println(arr[i]);
	}

	}

}
