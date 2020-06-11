package gameSystem;

import java.io.FileWriter;
import java.io.IOException;

public class FileIOSystem 
{
	FileIOSystem()
	{
		
	}
	
	public GameDataStorage RoadSaveFile()
	{
		
		return new GameDataStorage(0, 0, null, null);
	}
	
	public boolean WriteSaveFile()
	{
		String st = MainClass.gameData.teamName+","+MainClass.gameData.difficulty+","+MainClass.gameData.money;
		for (int i=0;i<MainClass.gameData.players.size();i++)
		{
			st+="\r\n";
			st = st+MainClass.gameData.players.elementAt(i).currentStamina+","+MainClass.gameData.players.elementAt(i).currentState;
		}
		
		try {
			FileWriter writer = new FileWriter("./Save/save.txt",false);
			writer.write(st);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			System.out.println("���� �ε� ����");
			e.printStackTrace();
		}
		
		
		return true;
	}
	

}
