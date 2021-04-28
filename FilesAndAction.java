package simplilearn.com.phase1project.lockedme;

import java.awt.List;

/*
 * Creator: Rakshith Shetty
 * Creation date: 25-04-2021
 *
 */

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
public class FilesAndAction {
	
	private String filedirectory;
	 private String filename;
	 private Integer action;
	 static String[] pathnammes;
	
	
public FilesAndAction(String directory) {
		// TODO Auto-generated constructor stub
	 this.filedirectory = directory;
	 
	}

public static void printfilesascending(String filedirectory)  {
	
	try {
	
	File f = new File(filedirectory);
	
	String[] pathnames = f.list();
	
					
	for (String file : pathnames) {
					
		System.out.println(file);
			
			}
			
		}
	
	catch(NullPointerException e) {
		
		System.out.println("Either file path is blank or the path entered is incorrect");
		
		
	}
	
	System.out.println("\n*******End of your search Action. Now you are in MainMenu*******");
	MainMenu.selectMainMenu();	 
}




public static void addfile(String directory) {
	
		   
	   File file = new File(directory); 
	   boolean result;  
	   try   
	   {  
	   result = file.createNewFile();   
	   if(result)   
	   {  
	   System.out.println("file created "+file.getCanonicalPath());  
	      
	   }  
	   else  
	   {  
	   System.out.println("File already exist at location: "+file.getCanonicalPath());  
	   }  
	   }   
	   catch (IOException e)   
	   {  
		   System.out.println("The error message is "+e.getMessage());
	   }         
	   System.out.println("*******End of your file add Action. Now you are in SubMenu******");
	   SubMenu.submenuformainmenu(2);
}

public static void deletefile(String directory,String filename) {
	
	String s1=directory;  
	String s2=filename;  
	String s3=s1.concat("\\").concat(s2);
	
	File file = new File("F:\\Rakshith\\Resume");
	
	if(SubMenu.exists(file, filename)) {
		
	File filedelete = new File(s3);
				
	System.out.println("deleting file ....."+filedelete);
	    
    if(filedelete.delete())
    {
        System.out.println("File deleted successfully");
        System.out.println("\n****End of your Deletion Action. Now you are in SubMenu****");
        
    }
    else
    {
        System.out.println("Failed to delete the file.Please make sure that the path and file name entered is correct");
        System.out.println("\n****End of your Deletion Action. Now you are in SubMenu****");
    }
    
	}
	
	else 
	{
		System.out.println("Failed to delete the file.Please make sure that the path and file name entered is correct");
        System.out.println("\n****End of your Deletion Action. Now you are in SubMenu****");
	}
	
    SubMenu.submenuformainmenu(2);
    
}

public static void searchfile(String directory, String filename) {
	
	File path = new File(directory);
	String[] flist = path.list();
	int flag = 0;
	if (flist == null) {
        System.out.println("The directory "+directory+" is empty");
    }
	
	else {
		  
        
        for (int i = 0; i < flist.length; i++) {
            String filenames = flist[i];
            if (filenames.equals(filename)) {
                System.out.println(filename + " is found");
                System.out.println("\n****End of your Search Action. Now you are in SubMenu****");
                flag = 1;
            }
        }
    }

    if (flag == 0) {
        System.out.println("File Not Found");
        System.out.println("\n****End of your Search Action. Now you are in SubMenu****");
    }
    
    SubMenu.submenuformainmenu(2);
}
	

}



