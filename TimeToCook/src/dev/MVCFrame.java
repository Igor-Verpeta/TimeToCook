package dev;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class MVCFrame extends JFrame {
	
	
	private JPanel contentPane;
	

	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MVCFrame frame = new MVCFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	public MVCFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		ButtonController bc = new ButtonController();
		
		JPanel panelMain = new JPanel();
		contentPane.add(panelMain, "name_92645140331300");
		panelMain.setLayout(null);
		
		RingButton ringButton = new RingButton(bc);
		
		bc.setButton(ringButton);
		ringButton.setBounds(33, 90, 169, 70);
		panelMain.add(ringButton);
		
		JButton btnRing4 = new JButton("Ring 4");
		btnRing4.setBounds(223, 171, 169, 70);
		panelMain.add(btnRing4);
		
		JButton btnRing2 = new JButton("Ring 2");
		btnRing2.setBounds(223, 90, 169, 70);
		panelMain.add(btnRing2);
		
		JButton btnRing3 = new JButton("Ring 3");
		btnRing3.setBounds(33, 171, 169, 70);
		panelMain.add(btnRing3);
		
		
	
		
		
		
		/*	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(5, 5));
		setContentPane(contentPane);
		ButtonController bc = new ButtonController();
		SwingButton btnNewButton = new SwingButton(bc);
		bc.setButton(btnNewButton);
		contentPane.add(btnNewButton, BorderLayout.WEST);
		
		RingButton ringButton = new RingButton(bc);
		bc.setButton(ringButton);
		contentPane.add(ringButton, BorderLayout.EAST);*/
	}

}
