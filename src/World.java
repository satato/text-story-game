//Author: Satato
//Creation Date: December 1st, 2018 -- 11:06PM

import java.util.Scanner;
import java.util.Random;

public class World
{
	//initialize imported java utilities
	public Scanner scan = new Scanner(System.in);
	public Random random = new Random();
	
	private int horizontalLocationIndex;
	private int verticalLocationIndex;
	private String[][] locations = {
			{"0","1","2","Marigald","4","5","6","7"},
			{"1","","","Marigald Day 5","","","",""},
			{"2","","","Marigald Day 4","","","",""},
			{"3","","","Marigald Day 3","","","",""},
			{"4","","","Marigald Day 2","","","",""},
			{"5","","","Marigald Day 1","","","",""},
			{"6","","","Cnetha","","","","Great Witch's House"},
			{"7","","","Forest Day 1","","","","Suspicious Hut"},
			{"8","","","Forest Day 2","","","",""},
			{"9","woods4","Wood Elf Camp","Southern Forest","woods 1","woods 2","woods 3","Flame Imp Camp"}};
	
	public World()
	{
		this.horizontalLocationIndex = 3;
		this.verticalLocationIndex = 6;
	}
	
	public void edgeError()
	{
		System.out.println("There seems to be a barrier blocking the way...\nYou don't think you can go this way.");
	}
	
	public void north()
	{
		if(this.verticalLocationIndex == 0)
			edgeError();
		else
			this.verticalLocationIndex = this.verticalLocationIndex - 1;
	}
	
	public void east()
	{
		if(this.horizontalLocationIndex == 7)
			edgeError();
		else
			this.horizontalLocationIndex = this.horizontalLocationIndex + 1;
	}
	
	public void south()
	{
		if(this.verticalLocationIndex == 9)
			edgeError();
		else
			this.verticalLocationIndex = this.verticalLocationIndex + 1;
	}
	
	public void west()
	{
		if(this.horizontalLocationIndex == 0)
			edgeError();
		else
			this.horizontalLocationIndex = this.horizontalLocationIndex - 1;
	}
	
}
