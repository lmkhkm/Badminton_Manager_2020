package gameUI;

import java.awt.Container;

import javax.swing.JFrame;

public class NewGameSettingFrame extends JFrame
{
	NewGameSettingFrame()
	{
		setTitle("New Game Setting");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container mainCont = getContentPane();
		
		setVisible(true);
		setSize(800,800);
	}
}
