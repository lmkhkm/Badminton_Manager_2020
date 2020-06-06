package gameSystem;

public class BadmintonPlayer 
{
	public int[] playerStat = new int[3]; //0-힘 1-체력 2-순발력
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
	
	public void playerStateChange(int status)//0-일반 상태, 1-부상, 2-징계중 --> 0일 경우 스테미나에 따른 상태 표시
	{
		switch (status)
		{
		case 0:
			this.canPlay = true;
			if (this.currentStamina>=100)
				this.currentState = "풀 컨디션";
			else if(this.currentStamina>=50)
				this.currentState = "일반 컨디션";
			else if(this.currentStamina>=30)
				this.currentState = "컨디션 저조";
			else if (this.currentStamina>=10)
			{
				this.canPlay = false;
				this.currentState = "탈진";
			}
			break;
			
		case 1:
			currentState = "부상"; this.canPlay = true; break;
			
		case 2:
			currentState = "징계"; this.canPlay = false; break;
		}
		
	}
	

}
