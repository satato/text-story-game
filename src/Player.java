//Author: Satato
//Creation Date: December 1st, 2018;; 1:22PM


import java.util.Scanner;
import java.util.Random;

public class Player
{
	//declaring Scanner-type and Random-type variables for scanning input and randomly generating numbers.
	public Scanner scan = new Scanner(System.in);
	public Random random = new Random();
	
	public static String[] Spells = {"1.Minor Healing","2.Ice Bolt","3.Fire Blast","4.Confuse","5.Void Shot","6.Major Healing","7.Ice Storm","8.Hurricane","9.Torrential Downpour","10.Ultimate Healing"};
	
	//declaring private variables representative of player stats/characteristics
	private int playerRace;
	private int playerClass;
	private int playerHP;
	private int MAXplayerHP;
	private int playerXP;
	private boolean spellCastingAbility;
	private String[] spells;
	private int playerDamage;
	private int playerDefense;
	private double mana;
	private double manaMAX;
	private String[][] inventory;

	//constructs player data based on their chosen class and random variables
	public Player(int userClass)
	{
		//it's a starting player, so they began with no exp and full mana:
		this.playerXP = 0;
		this.mana = 10.0;
		this.manaMAX = 10.00;
		//they also begin with an empty, 3x3 / 9-slot inventory
		this.inventory = new String[3][3];
		
		//randomly determines the player's race
		this.playerRace = random.nextInt(3);
		//based on race, semi-randomly determines base HP, Damage, and Defense according the story-outline.txt
		//if player is human:
		if(playerRace == 0)
		{
			MAXplayerHP = 15+random.nextInt(6);
			playerDamage = 5;
			playerDefense = 12+random.nextInt(4);
		}
		//if player is gnomish:
		else if(playerRace == 1)
		{
			MAXplayerHP = 12+random.nextInt(4);
			playerDamage = 8;
			playerDefense = 10+random.nextInt(4);
		}
		//if player is dwarven:
		else if(playerRace == 2)
		{
			MAXplayerHP = 18+random.nextInt(8);
			playerDamage = 3;
			playerDefense = 10+random.nextInt(6);
		}
		//if player is giant:
		else
		{
			MAXplayerHP = 15+random.nextInt(16);
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
			//creates player's spell list
			this.spells = new String[10];
			spells[0] = Spells[0];
			spells[1] = Spells[1];
			
			//gives player initial weapon in their inventory based on class
			inventory[0][0] = "1.Quarter Staff";
		}
		//if player is warrior
		else if(playerClass == 1)
		{
			//HP mod
			MAXplayerHP = playerHP + 10;
			
			//damage mod
			playerDamage = playerDamage + 10;
			
			//defense mod
			playerDefense = playerDefense + 3;
			
			//spellcaster?
			spellCastingAbility = false;
			//creates player's spell list (non-mage characters can only use minor healing spell)
			this.spells = new String[1];
			spells[0] = Spells[0];
			
			//gives player initial weapon in their inventory based on class
			inventory[0][0] = "1.Broadsword";
		}
		//if player is archer
		else
		{
			//hp mod
			MAXplayerHP = playerHP + 5;
			
			//no damage mod
			//defense mod
			playerDefense = playerDefense + 2;
			
			//spellcaster?
			spellCastingAbility = false;
			//creates player's spell list (non-mage characters can only use minor healing spell)
			this.spells = new String[1];
			spells[0] = Spells[0];
			
			//gives player initial weapon in their inventory based on class
			inventory[0][0] = "1.Bow";
		}
		
		//sets player HP to be the max since they haven't taken any damage or anything
		playerHP = MAXplayerHP;
		
	}
	
	
	public void viewInventory()
	{
		System.out.println("");
		for(int a=0;a<3;a++)
		{
			for(int b=0;b<3;b++)
			{
				System.out.print(this.inventory[a][b]+"");
			}
			System.out.println("");
		}
	}
	
}
