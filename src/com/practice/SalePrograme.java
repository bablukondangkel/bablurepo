package com.practice;

	public class SalePrograme {
		public static void main(String[] arg) {
			int costprice=100;
			int kg=5;
			int saleprice=80;
			int totalCost = kg*costprice; 
			int totalSale=kg*saleprice;
			if(totalSale > totalCost) {
				int profit=totalSale-totalCost; 
				System.out.println("profit:"+profit);
			}else{
				int loss = totalCost - totalSale;
				System.out.println("loss:"+loss);
			}
		
		}
	}

