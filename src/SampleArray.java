import java.util.Scanner;

public class SampleArray {

	public static void main(String[] args) {
		System.out.println("enter the size of the array: ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("enter the value of index : "+i);
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum of all elements of array is : "+sum);
	}

}
