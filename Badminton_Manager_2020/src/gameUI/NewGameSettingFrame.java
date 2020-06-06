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
	JButton backButton = new JButton("�ڷ� ����");
	
	GameDataStorage gameData;
	
	NewGameSettingFrame()
	{
		setTitle("New Game Setting");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout gird = new GridLayout(3,2);
		
		Container mainCont = getContentPane();
		mainCont.setLayout(gird);
		
		JLabel teamSetting = new JLabel("�� ����");
		JPanel teamNamePanel = new JPanel(); 
		JLabel teamNameLable = new JLabel("�� �̸� :"); teamNamePanel.add(teamNameLable);
		JTextField teamNameIs = new JTextField(15); teamNamePanel.add(teamNameIs);
		
		
		backButton.addActionListener(new PressButton());
		
		JLabel gameSetting = new JLabel("���� ����");
		JPanel gameDifficultPanel = new JPanel();
		
		JRadioButton gameDifficultEasy = new JRadioButton("����"); gameDifficultEasy.setSelected(true);
		JRadioButton gameDifficultHard = new JRadioButton("�����");
		ButtonGroup diffButtons = new ButtonGroup();
		diffButtons.add(gameDifficultEasy);
		diffButtons.add(gameDifficultHard);
		gameDifficultPanel.add(gameDifficultEasy);
		gameDifficultPanel.add(gameDifficultHard);
		
		JButton gameStartButton =  new JButton("���� ����");
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
					players[i] = new BadmintonPlayer(5,5,5,100,"Ǯ �����", true);
				}
				
				gameData = new GameDataStorage(0,1000,"�ӽ� ��", players);
				MainClass.gameData = gameData;

				MainGameFrame mainGame = new MainGameFrame();
			}
			
		}
		
	}
	
	
}
