//Author: Satato
//Start Date: November 18th, 2018 -- 11:08AM EST
//Finish Date: ???

//imports java utility "Scanner" so that you can read/scan input
import java.util.Scanner;

public class mainAdventureRun
{
	//global variable declaration:
	public static String userClass;
	public static String username;
	public static String userRace;
	public static int userExp;
	
	//declare Scanner-type variable "scan" to take user input for future
	public static Scanner scan = new Scanner(System.in);
	
	//game opening; contains initial dialogue and character set-up.
	public static void main(String[] args)
	{
		System.out.println("Hello there!\nWhat's your name, adventurer?\n");
		username = scan.nextLine();
		System.out.println("Wow..."+username+"...how valiant a name!");
		System.out.println("I'm Hendrick. Nice to meet you, "+username);
		System.out.println("I'd ask what brings you here...but the answer is me!\nhaha!");
		System.out.println("\n*laugh or stay silent?*\n");
		String userResponse = scan.nextLine();
		
		//ensures that the user chooses one of the options by repeating the question until they do.
		while(!(userResponse.equals("laugh")||userResponse.equals("stay silent")))
		{
			System.out.println("Invalid response.\n*Laugh or stay silent?*\n");
		}
		//gives appropriate response based on player's choice
		if(userResponse.equals("laugh"))
			System.out.println("\nHa! I knew you'd get a chuckle out of that one.");
		else if(userResponse.equals("stay silent"))
			System.out.println("\nOh...didn't like my joke I guess?\nWell alright...let's get back to the matter at hand then...");
		
		System.out.println("Well, "+username+", welcome to the village of Cnetha!");
		System.out.println("We've heard stories of your valiance and chivalry...we want to make you our Knight");
		
		
	}

}
