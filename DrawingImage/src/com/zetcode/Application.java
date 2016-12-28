/**
 * 
 */
package com.zetcode;

import java.awt.EventQueue;

import javax.swing.JFrame;

/**
 * @author jkhurana
 *
 */
public class Application extends JFrame{

	/**
	 * @param args
	 */
	
	public Application()
	{
		initUI();
	}
	
	private void initUI()
	{
		add(new Board());
		
		setSize(250,200);
		
		setTitle("Image Drawing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Application ex = new Application();
				ex.setVisible(true);
			}
		});
	}

}
