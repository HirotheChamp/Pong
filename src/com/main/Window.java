package com.main;

import javax.swing.JFrame;

public class Window {

	public Window(String title, Game game) {
		JFrame frame = new JFrame(title); 
	
		//when we press x on the game, its going to exit
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//i do not want to resize window
		frame.setResizable(false);
		
		//game is going to be a component object 
		frame.add(game);
		
		//packing all game components so they fit into the app
		frame.pack();
		
		//game appears centered to scene
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		
		game.start();
	}
}
