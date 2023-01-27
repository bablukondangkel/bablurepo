
public class DeleteinArray {

	public static void main(String[] args) {
		int place=3;
		
		int[] ar1=new int[] {12,56,78,13,14};
		int[] ar2=new int[ar1.length-1]; 
		
		for(int i=0;i<place;i++) {
			ar2[i]=ar1[i];
			
			}
		for(int i=place;i<ar1.length;i++) {
			ar2[i-1]=ar1[i];
			
		}
		for(int i=0;i<ar2.length;i++) {
			System.out.print(ar2[i]+" ");
		}
			
		}
	}

