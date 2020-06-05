package gameUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameUIMaster extends JFrame
{
	public GameUIMaster() 
	{
		setTitle("Badminton Manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout gird = new GridLayout(4,2);
		BorderLayout bord = new BorderLayout(10,10);
		
		Container mainCont = getContentPane();
		mainCont.setLayout(bord);
		
		ImageIcon badmintonBackGound = new ImageIcon();
		badmintonBackGound = getImageIcon("./Image/badmintonBackground.jpg", 800, 800/3*2);
		
		mainCont.add(new JLabel(badmintonBackGound), BorderLayout.NORTH);
		
		JPanel mainMenu = new JPanel(); //메인메뉴 패널
		mainMenu.setLayout(gird); //메인메뉴 페널에
		
		setVisible(true);
		setSize(800,800);
		
	}
	
	public ImageIcon getImageIcon(String dir) 
	{
		ImageIcon tempImageIcon = new ImageIcon(dir);
		return tempImageIcon;
	}
	
	public ImageIcon getImageIcon(String dir, int width, int height)
	{
		ImageIcon tempImageIcon = new ImageIcon(dir);
		Image originImg = tempImageIcon.getImage();
		Image changedImg = originImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return new ImageIcon(changedImg);
		
	}
	
}