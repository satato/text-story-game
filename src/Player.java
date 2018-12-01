//Author: Satato
//Creation Date: December 1st, 2018;; 1:22PM


import java.util.Scanner;
import java.util.Random;

public class Player
{
	//declaring Scanner-type and Random-type variables for scanning input and randomly generating numbers.
	public Scanner scan = new Scanner(System.in);
	public Random random = new Random();
	
	//declaring private variables representative of player stats/characteristics
	private int playerRace;
	private int playerClass;
	private int playerHP;
	private int playerXP;
	private boolean spellCastingAbility;
	private int[] spells;
	private int playerDamage;
	private int playerDefense;
	private double mana;

	//constructs player data based on their chosen class and random variables
	public Player(int userClass)
	{
		//it's a starting player, so they began with no exp and full mana:
		this.playerXP = 0;
		this.mana = 10.0;
		
		//randomly determines the player's race
		this.playerRace = random.nextInt(3);
		//based on race, semi-randomly determines base HP, Damage, and Defense according the story-outline.txt
		//if player is human:
		if(playerRace == 0)
		{
			playerHP = 15+random.nextInt(6);
			playerDamage = 5;
			playerDefense = 12+random.nextInt(4);
		}
		//if player is gnomish:
		else if(playerRace == 1)
		{
			playerHP = 12+random.nextInt(4);
			playerDamage = 8;
			playerDefense = 10+random.nextInt(4);
		}
		//if player is dwarven:
		else if(playerRace == 2)
		{
			playerHP = 18+random.nextInt(8);
			playerDamage = 3;
			playerDefense = 10+random.nextInt(6);
		}
		//if player is giant:
		else
		{
			playerHP = 15+random.nextInt(16);
			playerDamage = 10;
			playerDefense = 14+random.nextInt(5);
		}
		
		//assigns the user's class to their chosen class (0-mage, 1-warrior, or 2-archer)
		this.playerClass = userClass;
		
		//the following gives HP, Damage, and Defense modifiers based on class;;
		//also assigns other variables such as spellCastingAbility and spells accordingly
		
		//if user is mage
		if(playerClass == 0)
		{
			//no HP mod for mages
			//damage mod
			playerDamage = playerDamage + 5;
			
			//defense mod
			playerDefense = playerDefense - 1;
			
			//spellcaster?
			spellCastingAbility = true;
			spells = new int[10];
		}
		//if player is warrior
		else if(playerClass == 1)
		{
			//HP mod
			playerHP = playerHP + 10;
			
			//damage mod
			playerDamage = playerDamage + 10;
			
			//defense mod
			playerDefense = playerDefense + 3;
			
			//spellcaster?
			spellCastingAbility = false;
			spells = new int[0];
		}
		//if player is archer
		else
		{
			//hp mod
			playerHP = playerHP + 5;
			
			//no damage mod
			//defense mod
			playerDefense = playerDefense + 2;
			
			//spellcaster?
			spellCastingAbility = false;
			spells = new int[0];
		}
		
	}
}
