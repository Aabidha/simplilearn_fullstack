package com.LockedMe;

public class LockedMeMain 
{
	public static void main(String[] args) 
	{
		//Create main folder if not present in current folder structure
		FileHandling.createMainFolderIfNotPresent("main");
		MenuList.printWelcomeScreen("LockedMe", "Aabitha Bathool");
		FileHandlingOptions.handleWelcomeScreenInput();
	}

}
