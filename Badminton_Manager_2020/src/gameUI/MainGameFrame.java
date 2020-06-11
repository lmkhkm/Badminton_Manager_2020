package gameUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
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

import gameSystem.FileIOSystem;
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
	JButton gameSmashButton = new JButton("���Ž� ����!");
	JButton gameSubButton = new JButton("���� �ֱ�");
	JLabel gameScoreLabel = new JLabel("�츮  0   VS   0  ���");
	
	
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
		JButton gameSaveButton = new JButton("���� ����"); menuBar.add(gameSaveButton);
		gameSaveButton.addActionListener(new gameSaveButtonAction());
		
		JButton showGameSettingButton = new JButton("���� ����, ���� ����"); menuBar.add(showGameSettingButton); 
		showGameSettingButton.addActionListener(new discriptionAction());
		
		JButton trainingButton = new JButton("���� �Ʒ�");  menuBar.add(trainingButton);
		trainingButton.addActionListener(new trainingButtonAction());

		JButton matchStartButton = new JButton("��� ����"); menuBar.add(matchStartButton);
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
		
		JButton trainingStrangthButton = new JButton("�ٷ� �Ʒ�");
		JButton trainingEnduranceButton = new JButton("ü�� �Ʒ�");
		JButton trainingAgilityButton = new JButton("���߷� �Ʒ�");
		
		trainingPanel.add(trainingStrangthButton);
		trainingPanel.add(trainingEnduranceButton);
		trainingPanel.add(trainingAgilityButton);
		
		trainingPanel.add(new JLabel("���� ���׹̳�"));
		trainingPanel.add(trainingStaminaSlider);
		
		/*
		 * �� trainingPanel
		 * �Ʒ� gamePanel
		 */
		
		gamePanel.setLayout(new GridLayout(4,1));
		gamePanel.add(gameScriptTextArea);
		gamePanel.add(gameScoreLabel);
		gameScoreLabel.setFont(new Font("Gulim", Font.BOLD, 30));
		gameScoreLabel.setHorizontalAlignment(JLabel.CENTER);
		
		gamePanel.add(gameSmashButton);
		gamePanel.add(gameSubButton);
		
		
		
		
		
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
			mainCont.add(new JTextArea("������ �߾Ӵ��б� �����к� ���ر�  "
					+ "���� ����: ������ �Ʒý�Ű�� ��⿡ �����ϼ��� �� ���׹̳ʰ� �ʹ� �������� �ȵ˴ϴ�"),BorderLayout.CENTER);
		}
		
	}
	
	class gameSaveButtonAction implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			FileIOSystem fio = new FileIOSystem();
			
			fio.WriteSaveFile();
			
			mainCont.getComponent(1).setVisible(false);
			mainCont.remove(mainCont.getComponent(1));
			mainCont.add(new JTextArea("������ �����"),BorderLayout.CENTER);
		}
		
	}
	

}
