package com.practice;

	public class RevisionCalculate {
		public static void main(String[] arg) {
			int x=56;
			int y=56;
			RevisionCalculate obj=new RevisionCalculate();
			obj.multi(x, y);
			System.out.println("multipication result is:" +obj.multi(x,y));
			obj.add(x, y);
			System.out.println("addtion result is:" +obj.add(x, y) );
			obj.sub(x,y);
			System.out.println("substration result is:" +obj.sub(x, y));
			obj.div(x,y);
			System.out.println("division result is:" +obj.div(x, y));
			
	}

	public int multi(int x,int y) {
		int multi=x*y;
		return multi;
		
	}
	public int add(int x,int y) {
		int add=x+y;
		return add;
	}
	public int sub(int x,int y) {
		int sub=x-y;
		return sub;
		
	}
	public int div(int x,int y) {
		int div=x/y;
		return div;
	}
	

}
