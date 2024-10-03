package com.arcada.devops.nylunvik.devopsLecture;

import java.util.Scanner;
import java.util.ArrayList;

public final class App {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type the name of a person to see a list of their friends.\n"
				+ "The persons currently included in the data set are:\n"
				+ "Lisa\n"
				+ "Erik\n"
				+ "Input:");
		String inputName = scanner.nextLine();
		findFriends(inputName);
		scanner.close();
	} //end of main()
	
	public static boolean findFriends(String s) {
		
		ArrayList<String> friendsLisa = new ArrayList<String>();
	    friendsLisa.add("Erik");
	    friendsLisa.add("Henrik");
	    friendsLisa.add("Fiona");
	    
	    ArrayList<String> friendsErik = new ArrayList<String>();
		friendsErik.add("Lisa");
		friendsErik.add("Arvid");
		
		// is empty > true
		if (s.isEmpty() ) {
			System.out.println("WRONG INPUT. Input a name and press enter.");
			return false;
		} // Lisa
		if (s.equals("Lisa")){
			System.out.println("These are all of " + s + "'s friends:");
			for (String i : friendsLisa) {
		      System.out.println(i);
	    	}
			return true;
		} // Erik
		else if (s.equals("Erik")) {
			System.out.println("These are all of " + s + "'s friends:");
			for (String i : friendsErik) {
		      System.out.println(i);
	    	}
			return true;
		} // neither
		else {
			System.out.println(s + " is not in the data set.");
			return false;
		}
	} //end of findFriends()
	
}