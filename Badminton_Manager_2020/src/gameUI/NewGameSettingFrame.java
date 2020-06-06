package gameUI;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import gameSystem.BadmintonPlayer;
import gameSystem.GameDataStorage;
import gameSystem.MainClass;

public class NewGameSettingFrame extends JFrame
{
	JButton backButton = new JButton("뒤로 가기");
	
	GameDataStorage gameData;
	
	NewGameSettingFrame()
	{
		setTitle("New Game Setting");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout gird = new GridLayout(3,2);
		
		Container mainCont = getContentPane();
		mainCont.setLayout(gird);
		
		JLabel teamSetting = new JLabel("팀 세팅");
		JPanel teamNamePanel = new JPanel(); 
		JLabel teamNameLable = new JLabel("팀 이름 :"); teamNamePanel.add(teamNameLable);
		JTextField teamNameIs = new JTextField(15); teamNamePanel.add(teamNameIs);
		
		
		backButton.addActionListener(new PressButton());
		
		JLabel gameSetting = new JLabel("게임 세팅");
		JPanel gameDifficultPanel = new JPanel();
		
		JRadioButton gameDifficultEasy = new JRadioButton("쉬움"); gameDifficultEasy.setSelected(true);
		JRadioButton gameDifficultHard = new JRadioButton("어려움");
		ButtonGroup diffButtons = new ButtonGroup();
		diffButtons.add(gameDifficultEasy);
		diffButtons.add(gameDifficultHard);
		gameDifficultPanel.add(gameDifficultEasy);
		gameDifficultPanel.add(gameDifficultHard);
		
		JButton gameStartButton =  new JButton("게임 시작");
		gameStartButton.addActionListener(new PressButton());
		
		
		mainCont.add(teamSetting);
		mainCont.add(gameSetting);
		mainCont.add(teamNamePanel);
		mainCont.add(gameDifficultPanel);
		mainCont.add(backButton);
		mainCont.add(gameStartButton);
		
		
		setVisible(true);
		setSize(400,200);
		
		
	}
	
	
	class PressButton implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == backButton)
			{
				setVisible(false);
				MainMenuFrame main = new MainMenuFrame();
			}
			else
			{
				setVisible(false);
				BadmintonPlayer[] players = new BadmintonPlayer[3];
				for (int i=0;i<3;i++)
				{
					players[i] = new BadmintonPlayer(5,5,5,100,"풀 컨디션", true);
				}
				
				gameData = new GameDataStorage(0,1000,"임시 팀", players);
				MainClass.gameData = gameData;

				MainGameFrame mainGame = new MainGameFrame();
			}
			
		}
		
	}
	
	
}
