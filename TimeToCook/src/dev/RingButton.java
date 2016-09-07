package dev;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import dev.DataModel.Reminder;



public class RingButton extends JButton implements IButton,ActionListener {
	
	
	
	
	private IActionListener listener;

	public RingButton(IActionListener listener) {
		super("Ring");
		init(listener);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
	  listener.action();
		
	}

	@Override
	public void init(IActionListener listener) {
		this.listener = listener;
		addActionListener(this);		
	}

	

	@Override
	public void ringOn(int seconds) {
		    
		
	}

	@Override
	public DataModel createStove(int countRingStove, boolean ovenPresent) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
