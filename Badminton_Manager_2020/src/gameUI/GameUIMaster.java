package gameUI;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameUIMaster extends JFrame
{
	public GameUIMaster() 
	{

	}
	
	public ImageIcon getImageIcon(String dir) //�̹����� �ҷ��ͼ� �̹��� ������ȭ ��Ű�� �޼ҵ�
	{
		ImageIcon tempImageIcon = new ImageIcon(dir);
		return tempImageIcon;
	}
	
	public ImageIcon getImageIcon(String dir, int width, int height) //�̹����� �ҷ��ͼ� ������ ũ�⿡ �´� �̹��� ������ȭ ��Ű�� �޼ҵ�
	{
		ImageIcon tempImageIcon = new ImageIcon(dir);
		Image originImg = tempImageIcon.getImage();
		Image changedImg = originImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return new ImageIcon(changedImg);
		
	}
	
}