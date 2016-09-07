package dev;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;



public class SwingButton extends JButton implements IButton,ActionListener {
	
	
	
	private IActionListener listener;

	public SwingButton(IActionListener listener) {
		super("off");
		init(listener);
	}
	
	@Override
	public void init(IActionListener listener) {
		this.listener = listener;
		addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		listener.action();
		
	}

	

	@Override
	public void ringOn(int seconds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DataModel createStove(int countRingStove, boolean ovenPresent) {
		// TODO Auto-generated method stub
		return null;
	}


	

	

}
