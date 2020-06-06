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

public class MainGameFrame extends JFrame
{	
	GameUIMaster uiMaster = new GameUIMaster();
	
	JPanel trainingPanel = new JPanel();
	JPanel gamePanel = new JPanel();
	Container mainCont = getContentPane();
	
	public MainGameFrame()
	{
		setTitle("Badminton Manager 2020");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelDefaltSetting();
		
		GridLayout gird = new GridLayout(3,1);
		BorderLayout bord = new BorderLayout(10,10);
		
		
		
		JPanel menuBar = new JPanel();
		JButton gameSaveButton = new JButton("���� ����"); menuBar.add(gameSaveButton);
		JButton showGameSettingButton = new JButton("���� ����, ���� ����"); menuBar.add(showGameSettingButton);
		JButton trainingButton = new JButton("���� �Ʒ�");  menuBar.add(trainingButton);
		JButton matchStartButton = new JButton("��� ����"); menuBar.add(matchStartButton);
		
		trainingButton.addActionListener(new trainingButtonAction());
		
		mainCont.add(menuBar, BorderLayout.NORTH);

		ImageIcon badmintonPlayerIcon = uiMaster.getImageIcon("./Image/badmintonPlayer.jpg", 300, 300);
		mainCont.add(new JLabel(badmintonPlayerIcon), BorderLayout.CENTER);
		
		setVisible(true);
		setSize(800,800);
	}
	
	
	public void PanelDefaltSetting()
	{
		ImageIcon badmintonPlayerIcon = uiMaster.getImageIcon("./Image/badmintonPlayer.jpg", 100, 100);
		GridLayout gird = new GridLayout(4,1);
		trainingPanel.setLayout(gird);
		trainingPanel.add(new JLabel(badmintonPlayerIcon));
		
		JButton trainingStrangthButton = new JButton("�ٷ� �Ʒ�");
		JButton trainingEnduranceButton = new JButton("ü�� �Ʒ�");
		JButton trainingAgilityButton = new JButton("���߷� �Ʒ�");
		
		trainingPanel.add(trainingStrangthButton);
		trainingPanel.add(trainingEnduranceButton);
		trainingPanel.add(trainingAgilityButton);
		
		trainingPanel.add(new JLabel("���� ���׹̳�"));
		
		
		/*
		 * �� trainingPanel
		 * �Ʒ� gamePanel
		 */
		
		
	}
	
	class trainingButtonAction implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			mainCont.getComponent(1).setVisible(false);
			mainCont.add(trainingPanel, BorderLayout.CENTER);
		}
		
	}
	
	class gameButtonAction implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			mainCont.getComponent(1).setVisible(false);
			mainCont.add(gamePanel, BorderLayout.CENTER);
			
		}
		
	}

}
