package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import logic.Game;
import logic.objects.Dino;

public class Scene extends JPanel implements KeyListener, Runnable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MainWindow mainWindow;
	
	private JLabel dinoLabel;
	
	private Dino dino;
	
	private Thread h1;
	
	private int counterJump;

	public Scene(MainWindow main) {
		
		this.setBackground(Color.WHITE);
		this.mainWindow = main;
		this.setFocusable(true);
		this.setLayout(new BorderLayout());
		
		
		dino = main.getGame().getDino();
		dino.setX(60);
		dino.setY(main.getSize().height + 200 );
		
		dinoLabel = new JLabel(mainWindow.getGame().getDino().getSprite());
		this.add(dinoLabel, BorderLayout.CENTER);
		
		h1 = new Thread(this);
		h1.start();
		
		counterJump = 0;
		
		this.addKeyListener(this);
		
	}

	@Override
	public void keyPressed(KeyEvent key) {
		// TODO Auto-generated method stub
		Game game  = mainWindow.getGame();
		
		switch (key.getKeyCode()) {
		case KeyEvent.VK_SPACE:
			if(!game.isJumpBlock()) {
				game.setJumpBlock(true);
				System.out.println("Entre");
			}
			break;

		default:
			System.out.println("Fuciono");
			break;
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void reloadDino() {
		Dino myDino = mainWindow.getGame().getDino();
		dinoLabel.setLocation(myDino.getX(), myDino.getY());
	}

	@Override
	public void run() {
		Thread ct = Thread.currentThread();
		 while(ct == h1) {
			 
			 boolean isJump = mainWindow.getGame().isJumpBlock();
			 System.out.println(isJump);
			 if (isJump) {
				 counterJump++;
				 if (counterJump > 0 && counterJump <= 100) {
					 dino.setY(dino.getY() - 1);
				 }
				 else if(counterJump > 100 && counterJump < 200){
					 dino.setY(dino.getY() + 1);
				 }
				 else {
					 counterJump = 0;
					 dino.setX(60);
					 dino.setY(mainWindow.getSize().height - 150);
					 mainWindow.getGame().setJumpBlock(false);
				 }
			 }
			 dinoLabel.setBounds(dino.getX(), dino.getY(), 70, 70);
			 System.out.println(dino.getX() + " - " +  dino.getY());
		  try {
			  Thread.sleep(1);
		  }catch(InterruptedException e) {}
		 }
	}

}
