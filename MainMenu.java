package simplilearn.com.phase1project.lockedme;

/*
 * Creator: Rakshith Shetty
 * Creation date: 25-04-2021
 *
 */

import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainMenu {
	
	 static Integer mainMenu;
	 static Integer subMenu;
	 
	
	public static void selectMainMenu() {
				
		System.out.println("\nPlease select your option\n");
		System.out.println("1. Get the files in your directory");
		System.out.println("2. add/delete/search file in your directory");
		System.out.println("3. close the application");
		
		Scanner scan = new Scanner(System.in);
		mainMenu = scan.nextInt();
		checkmainmenuselected(mainMenu);
								
	}
	
	private static void checkmainmenuselected(int mainmenu) {
		
		switch(mainmenu) {
		
		case 1 :
			firstMainMenu();
			break;
			
		case 2 :
			SecondMainMenu();
			break;
		
		case 3 :
			thirdMainMenu();
			break;
			
		default :
			System.out.println("Wrong option selected. Please select the corect option again");
			selectMainMenu();
			break;
			
		}	
		
	}

	private static String thirdMainMenu() {
		System.out.println("Closing your application.... ");
		System.exit(0);
		return null;
	}

	private static void SecondMainMenu() {
		
		SubMenu.submenuformainmenu(2);
		
		
	}

	public static void firstMainMenu() {
				
		
		System.out.println("Please enter the directory name where you want to search for files\n");
		
		Scanner scan = new Scanner(System.in);
		String directory = scan.nextLine();
		//dir.close();
		
		
			FilesAndAction.printfilesascending(directory);
		
		
		
				
	}
	
		
	
}
