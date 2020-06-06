package gameSystem;

public class BadmintonPlayer 
{
	public int[] playerStat = new int[3]; //0-�� 1-ü�� 2-���߷�
	public int currentStamina;
	
	public String currentState;
	
	public boolean canPlay;
	
	public BadmintonPlayer(int strangth, int endurance, int agility, int curStamina, String curState, boolean canPlay)
	{
		this.playerStat[0] = strangth;
		this.playerStat[1] = endurance;
		this.playerStat[2] = agility;
		this.currentStamina = curStamina;
		this.currentState = curState;
		this.canPlay = canPlay;
	}
	
	public void playerStateChange(int status)//0-�Ϲ� ����, 1-�λ�, 2-¡���� --> 0�� ��� ���׹̳��� ���� ���� ǥ��
	{
		switch (status)
		{
		case 0:
			this.canPlay = true;
			if (this.currentStamina>=100)
				this.currentState = "Ǯ �����";
			else if(this.currentStamina>=50)
				this.currentState = "�Ϲ� �����";
			else if(this.currentStamina>=30)
				this.currentState = "����� ����";
			else if (this.currentStamina>=10)
			{
				this.canPlay = false;
				this.currentState = "Ż��";
			}
			break;
			
		case 1:
			currentState = "�λ�"; this.canPlay = true; break;
			
		case 2:
			currentState = "¡��"; this.canPlay = false; break;
		}
		
	}
	

}
