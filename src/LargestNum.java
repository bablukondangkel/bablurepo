
public class LargestNum {
	
		public static void main(String[] arg) {
			int[] ar=new int[]{23,55,56,92,100,200};
			int max=0;
			for(int i=0;i<ar.length;i++) {
				if(ar[i]>max) {
				max=ar[i];
				}
			}
			System.out.println("gretest number is:"+max);
		}

	}
