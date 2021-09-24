package com.Start.Antonio;

import java.util.Scanner;

public class Player {

	String firstName = "";
	String sirName = "";
	int age = 0;
	
	String nameInput = "";
	
	Scanner sc = new Scanner(System.in);

	
	public Player() {
		
	}
	
	private boolean validateInputStr(String nameInput) {
		 if (nameInput == null)  return false;// checks if the String is null 
		
		int len = nameInput.length();
		
		for(int i = 0; i< len; i++) {
			if((Character.isLetter(nameInput.charAt(i)) == false)) {
				
				
				System.out.println("Analphabetic");
				System.exit(0);
				return false;
				
				//-----------------------------------------------------fehler ausgeben!!!! System.exit(0);
			}
		}
		
		return true;
		//-----------------------------------------------------------continue
	}
	
	public void catchData() {
		
		
		System.out.println("What's your First Name? (Please enter letters)");
		firstName = sc.next();
		
		validateInputStr(firstName);
		
		System.out.println("What's your Sir Name? (Please enter letters)");
		sirName = sc.next();
		
		validateInputStr(sirName);
		
		System.out.println("How old are you? (Please enter integers between 0-120)");
		
		age = sc.nextInt();
		
	}
	
	public String outputData() {
		
		return firstName +" " + sirName + " " + age;
		
	}
	
	public int age() {
		return age;
	}
	
	public String firstName() {
		return firstName;
	}
	
	public String sirName() {
		return sirName;
	}
}
