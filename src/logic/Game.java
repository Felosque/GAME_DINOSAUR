package logic;

import java.awt.Image;

import javax.swing.ImageIcon;

import logic.objects.Dino;

public class Game {
	
	// False, can jump - true, can't jump
	private boolean jumpBlock;
	
	private int score;
	
	private boolean gameOver;
	
	private double generalVelocity;
	
	private Dino dino;

	public Game(boolean jumpBlock, int score, boolean gameOver) {
		super();
		this.jumpBlock = jumpBlock;
		this.score = score;
		this.gameOver = gameOver;
		
		ImageIcon spriteDino = new ImageIcon("./img/GoogleDino.gif");
		Image dinoScale = spriteDino.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
		spriteDino = new ImageIcon(dinoScale);
		
		this.dino = new Dino(60, 200, spriteDino, 1, 3);
		System.out.println(dino.getX() + " - " +  dino.getY());
		this.generalVelocity = 1;
	}

	public boolean isJumpBlock() {
		return jumpBlock;
	}

	public void setJumpBlock(boolean jumpBlock) {
		this.jumpBlock = jumpBlock;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}

	public Dino getDino() {
		return dino;
	}

	public void setDino(Dino dino) {
		this.dino = dino;
	}

	public double getGeneralVelocity() {
		return generalVelocity;
	}

	public void setGeneralVelocity(double generalVelocity) {
		this.generalVelocity = generalVelocity;
	}
	
}
