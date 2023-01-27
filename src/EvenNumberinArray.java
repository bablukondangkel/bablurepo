
public class EvenNumberinArray {

	public static void main(String[] args) {
		int[] ar=new int[] {12,45,23,13,18,2};
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				System.out.println("All even number:"+ar[i]);
			}
		}
	}

}
