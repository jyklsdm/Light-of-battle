package com.huoli.BaseJFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

@SuppressWarnings("serial")
public abstract class BaseJFrame extends JFrame implements ActionListener {
	
	protected JLayeredPane lay;
	
	public BaseJFrame() {
		this.setLocation(500,200);
		this.setSize(800,800);
		this.setResizable(false);
	}
	
	public void run() {
		
	}
	
	@Override
	public void actionPerformed (ActionEvent e) {
	}
}
