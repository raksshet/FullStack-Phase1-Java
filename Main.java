
package simplilearn.com.phase1project.lockedme;

/*
 * Creator: Rakshith Shetty
 * Creation date: 25-04-2021
 *
 */
public class Main {
	
	public static void welcomeScreen() {
		
		System.out.println("**************************************\n"
				+ "Welcome to LockedMe.com\n"
				+ "Application Type: POC\n"
				+ "Created by: Rakshith Shetty\n"
				+ "Contact emal: rshetty89@gmail.com\n"
				+ "Handphone: +91 9742553322\n\n"
				+ "**************************************");
			
	}
		
	public static void main(String[] args) {
		
		welcomeScreen();
		MainMenu.selectMainMenu();
					
				
	}
	
}
