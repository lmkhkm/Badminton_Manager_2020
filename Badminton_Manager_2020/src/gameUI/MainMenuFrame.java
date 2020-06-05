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

public class MainMenuFrame extends JFrame
{
	public MainMenuFrame() 
	{
		GameUIMaster uiMaster = new GameUIMaster();
		
		setTitle("Badminton Manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout gird = new GridLayout(3,1);
		BorderLayout bord = new BorderLayout(10,10);
		
		Container mainCont = getContentPane();
		mainCont.setLayout(bord);
		
		ImageIcon badmintonBackGound = new ImageIcon();
		badmintonBackGound = uiMaster.getImageIcon("./Image/badmintonBackground.jpg", 800, 800/3*2);
		
		mainCont.add(new JLabel(badmintonBackGound), BorderLayout.NORTH);
		
		JPanel mainMenu = new JPanel(); //메인메뉴 패널
		mainMenu.setLayout(gird); //메인메뉴 페널에 그리드 레이아웃 추가
		
		JButton newGameButton = new JButton("새로운 게임");
		JButton roadGameButton = new JButton("불러오기");
		
		newGameButton.addActionListener(new NewGameActionListener());
		roadGameButton.addActionListener(new RoadGameActionListener());
		
		JLabel titleLabel = new JLabel("BADMINTON MANAGER 2020");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("Gulim", Font.BOLD, 30));
		mainMenu.add(titleLabel);
		mainMenu.add(newGameButton);
		mainMenu.add(roadGameButton);
		
		mainCont.add(mainMenu, BorderLayout.CENTER);
		
		mainCont.add(new JLabel("Made by JunKu Heo Chung-Ang Univ. 20164352"), BorderLayout.SOUTH);
		
		setVisible(true);
		setSize(800,800);
	}

	class NewGameActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			setVisible(false);
			NewGameSettingFrame gameSettingFrame = new NewGameSettingFrame();
		}
	}
	
	class RoadGameActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			setVisible(false);
			MainGameFrame mainGameFrame = new MainGameFrame();
		}
	}
	
}



