package gameSystem;

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
		return true;
	}
	

}
