package simplilearn.com.phase1project.lockedme;

import java.io.File;

/*
 * Creator: Rakshith Shetty
 * Creation date: 25-04-2021
 *
 */

import java.util.Scanner;

public class SubMenu {
	
	
	
	public static void submenuformainmenu(int mainmenuoption) {
		
		if(mainmenuoption==2) {
			
		
			
			System.out.println("\nPlease select your option\n");
			System.out.println("0. Go back to MainMenu");
			System.out.println("1. add files into your directory");
			System.out.println("2. delete file in your directory");
			System.out.println("3. Search file in your directory");
			
			Scanner scan = new Scanner(System.in);
			int submenu = scan.nextInt();
			checksubmenuselected(submenu,mainmenuoption);
			
						
		}
	}

	private static void checksubmenuselected(int submenu, int mainmenu) {
		
switch(submenu) {

		case 0:
			MainMenu.selectMainMenu();
		
		case 1 :
			firstSubMenu();
			break;
			
		case 2 :
			SecondSubMenu();
			break;
		
		case 3 :
			ThirdSubMenu();
			
		default :
			System.out.println("Wrong options selected. Please select the corect option again");
			submenuformainmenu(mainmenu);
			break;
			
		}	
		
	}

	private static void ThirdSubMenu() {
		
		System.out.println("Please enter the directory name where you want search files\n");
		
		Scanner scan = new Scanner(System.in);
		String directory = scan.nextLine();
		System.out.println("Please enter the file name");
		String filename = scan.nextLine();
		FilesAndAction.searchfile(directory,filename);
		MainMenu.selectMainMenu();
	}

	 public static void SecondSubMenu() {
		
		System.out.println("Please enter the directory name where you want delete files\n");
		
		Scanner scan = new Scanner(System.in);
		String directory = scan.nextLine();
		System.out.println("Please enter the file name");
		String filename = scan.nextLine();
		String s1=directory;  
		String s2=filename;  
		String s3=s1.concat("\\").concat(s2);
					
		FilesAndAction.deletefile(directory,filename);
		
		
	}

	public static void firstSubMenu() {
		
		System.out.println("Please enter the directory name where you want add files\n");
		
		Scanner scan = new Scanner(System.in);
		String directory = scan.nextLine();
		System.out.println("Please enter the file name");
		String filename = scan.nextLine();
		String s1=directory;  
		String s2=filename;  
		String s3=s1.concat("\\").concat(s2);
			
		FilesAndAction.addfile(s3);
		
		
		
	}
	
	public static boolean exists(File dir, String filename){
	    String[] files = dir.list();
	    for(String file : files)
	        if(file.equals(filename)) {
	        	System.out.println("file name is "+file);
	            return true;   
	        }
	    return false;
	}

}
