package gameUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

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
		
		GridLayout gird = new GridLayout(2,1);
		BorderLayout bord = new BorderLayout(10,10);
		
		Container mainCont = getContentPane();
		mainCont.setLayout(bord);
		
		ImageIcon badmintonBackGound = new ImageIcon();
		badmintonBackGound = uiMaster.getImageIcon("./Image/badmintonBackground.jpg", 800, 800/3*2);
		
		mainCont.add(new JLabel(badmintonBackGound), BorderLayout.NORTH);
		
		JPanel mainMenu = new JPanel(); //���θ޴� �г�
		mainMenu.setLayout(gird); //���θ޴� ��ο� �׸��� ���̾ƿ� �߰�
		
		JButton newGameButton = new JButton("���ο� ����");
		JButton roadGameButton = new JButton("�ҷ�����");
		
		mainMenu.add(newGameButton);
		mainMenu.add(roadGameButton);
		
		mainCont.add(mainMenu, BorderLayout.CENTER);
		
		mainCont.add(new JLabel("Made by JunKu Heo Chung-Ang Univ. 20164352"), BorderLayout.SOUTH);
		
		setVisible(true);
		setSize(800,800);
	}

}
