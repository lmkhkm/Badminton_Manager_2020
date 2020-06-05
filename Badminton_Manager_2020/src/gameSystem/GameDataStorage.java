package gameSystem;

import java.util.Vector;

public class GameDataStorage 
{
	public int difficulty;
	public int money;
	
	public String teamName;
	
	public Vector<BadmintonPlayer> players = new Vector<BadmintonPlayer>();
	
	GameDataStorage(int difficulty, int money, String teamName, BadmintonPlayer[] players)
	{
		this.difficulty = difficulty;
		this.money = money;
		this.teamName = teamName;
		
		for (int i=0;i<players.length;i++)
		{
			this.players.add(players[i]);
		}
	}
	
	
	public boolean GameSave()
	{
		return true;
	}

}
