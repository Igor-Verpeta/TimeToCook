package dev;

import java.awt.Color;




 interface IButton {
	
	public void init(IActionListener listener); // ����������� � ����������� ������ ���������� ������� 

	public void setText(String text);
	
	public void setForeground(Color black);
	
	public DataModel createStove(int countRingStove,boolean ovenPresent );
	
	public void ringOn(int seconds);
	
	public void setVisible(boolean b);

	

	

	

}
