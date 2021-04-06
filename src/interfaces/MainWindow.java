package interfaces;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import logic.Game;

public class MainWindow extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Scene scene;
	
	private Game game;
	
	
	public MainWindow() {
		
		game = new Game(false, 0, false);
		
		scene = new Scene(this);
		this.add(scene, BorderLayout.CENTER);
		
		this.setVisible(true);
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public static void main(String[] args) {
		MainWindow main = new MainWindow();
		main.setSize(new Dimension(700, 400));
		main.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//main.setResizable(false);
		main.setLocationRelativeTo(null);
	}
	
}
