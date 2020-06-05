package gameUI;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameUIMaster extends JFrame
{
	public GameUIMaster() 
	{

	}
	
	public ImageIcon getImageIcon(String dir) //이미지를 불러와서 이미지 아이콘화 시키는 메소드
	{
		ImageIcon tempImageIcon = new ImageIcon(dir);
		return tempImageIcon;
	}
	
	public ImageIcon getImageIcon(String dir, int width, int height) //이미지를 불러와서 정해진 크기에 맞는 이미지 아이콘화 시키는 메소드
	{
		ImageIcon tempImageIcon = new ImageIcon(dir);
		Image originImg = tempImageIcon.getImage();
		Image changedImg = originImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return new ImageIcon(changedImg);
		
	}
	
}