package com.practice;

public class GuessTheWord {

	public static void main(String[] args) {

		String actualWord = new String("Hello");
		String guessWord = new String("Hello");
		
		if(actualWord.equalsIgnoreCase(guessWord)) {
			System.out.println("Score is: "+(actualWord.length()*2));
		}else {
			System.out.println("Score is: "+0);
		}
		
	}

}
