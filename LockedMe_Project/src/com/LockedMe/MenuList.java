package com.LockedMe;

public class MenuList 
{
	
	public static void printWelcomeScreen(String appName, String developerName) {
		String ANSI_RED = "\u001B[31m";
		String ANSI_RESET = "\u001B[0m";
		String companyDetails = String.format("******************************************************************************\n"
				+ "\t        Welcome to %s.com \n" + "\t This application was developed by %s\n"
				+ "******************************************************************************\n", appName, developerName);
		String appFunction = "You can use this application to :-\n"
				+ "=>Retrieve all file names in the \"main\" folder\n"
				+ "=>Search, add, or delete files in \"main\" folder.\n"
				+ ANSI_RED +"\n((Please be careful to ensure that the correct filename is provided for searching or deleting files))\n" + ANSI_RESET ;
		System.out.println(companyDetails);
		System.out.println(appFunction);
	}
	
	 

	public static void displayMenu() 
	{
		String ANSI_CYAN= "\u001B[36m";
		String ANSI_RESET = "\u001B[0m";
		String menu = ANSI_CYAN + "\n****** Select any option number from below and press Enter ******\n\n" + ANSI_RESET
				+ "1) Retrieve all files inside \"main\" folder\n" + "2) Display menu for File operations\n"
				+ "3) Exit program\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Add a file to \"main\" folder\n" + "2) Delete a file from \"main\" folder\n"
				+ "3) Search for a file from \"main\" folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

		System.out.println(fileMenu);
	}


}
