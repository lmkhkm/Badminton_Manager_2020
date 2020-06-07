package gameUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import gameSystem.MainClass;

public class MainGameFrame extends JFrame
{	
	GameUIMaster uiMaster = new GameUIMaster();
	
	JPanel trainingPanel = new JPanel();
	JPanel gamePanel = new JPanel();
	Container mainCont = getContentPane();
	
	JSlider trainingStaminaSlider = new JSlider(0,100,MainClass.gameData.players.get(0).currentStamina);
	JTextField trainingStetTextField = new JTextField(30);
	
	JTextArea gameScriptTextArea = new JTextArea();
	
	int myScore = 0;
	int thereScore = 0;
	
	public MainGameFrame()
	{
		setTitle("Badminton Manager 2020");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelDefaltSetting();
		
		GridLayout gird = new GridLayout(3,1);
		BorderLayout bord = new BorderLayout(10,10);
		
		
		
		JPanel menuBar = new JPanel();
		JButton gameSaveButton = new JButton("게임 저장"); menuBar.add(gameSaveButton);
		
		JButton showGameSettingButton = new JButton("게임 설정, 설명 보기"); menuBar.add(showGameSettingButton); 
		showGameSettingButton.addActionListener(new discriptionAction());
		
		JButton trainingButton = new JButton("선수 훈련");  menuBar.add(trainingButton);
		trainingButton.addActionListener(new trainingButtonAction());

		JButton matchStartButton = new JButton("경기 출전"); menuBar.add(matchStartButton);
		matchStartButton.addActionListener(new gameButtonAction());
		
		mainCont.add(menuBar, BorderLayout.NORTH);

		ImageIcon badmintonPlayerIcon = uiMaster.getImageIcon("./Image/badmintonPlayer.jpg", 300, 300);
		mainCont.add(new JLabel(badmintonPlayerIcon), BorderLayout.CENTER);
		
		setVisible(true);
		setSize(800,800);
	}
	
	
	public void PanelDefaltSetting()
	{
		ImageIcon badmintonPlayerIcon = uiMaster.getImageIcon("./Image/badmintonPlayer.jpg", 100, 100);
		GridLayout gird = new GridLayout(7,1);
		trainingPanel.setLayout(gird);
		trainingPanel.add(new JLabel(badmintonPlayerIcon));
		
		JButton trainingStrangthButton = new JButton("근력 훈련");
		JButton trainingEnduranceButton = new JButton("체력 훈련");
		JButton trainingAgilityButton = new JButton("순발력 훈련");
		
		trainingPanel.add(trainingStrangthButton);
		trainingPanel.add(trainingEnduranceButton);
		trainingPanel.add(trainingAgilityButton);
		
		trainingPanel.add(new JLabel("현재 스테미나"));
		trainingPanel.add(trainingStaminaSlider);
		
		/*
		 * 위 trainingPanel
		 * 아래 gamePanel
		 */
		
		gamePanel.setLayout(new GridLayout(3,1));
		gamePanel.add(gameScriptTextArea);
		
		
		
		
	}
	
	class trainingButtonAction implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			mainCont.getComponent(1).setVisible(false);
			mainCont.remove(mainCont.getComponent(1));
			mainCont.add(trainingPanel, BorderLayout.CENTER);
			mainCont.getComponent(1).setVisible(true);
		}
		
	}
	
	class gameButtonAction implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			mainCont.getComponent(1).setVisible(false);
			mainCont.remove(mainCont.getComponent(1));
			mainCont.add(gamePanel, BorderLayout.CENTER);
			mainCont.getComponent(1).setVisible(true);
			
		}
		
	}
	
	class discriptionAction implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			mainCont.getComponent(1).setVisible(false);
			mainCont.remove(mainCont.getComponent(1));
			mainCont.add(new JTextArea("만든이 중앙대학교 기계공학부 허준구/r/n게임 설명: 선수를 훈련시키고 경기에 투입하세요 단 스테미너가 너무 떨어지면 안됩니다"),BorderLayout.CENTER);
		}
		
	}
	
	class gameSaveButtonAction implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			mainCont.getComponent(1).setVisible(false);
			mainCont.remove(mainCont.getComponent(1));
			mainCont.add(new JTextArea("게임이 저장됨"),BorderLayout.CENTER);
		}
		
	}

}
