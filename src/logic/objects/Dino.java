package logic.objects;

import javax.swing.ImageIcon;

public class Dino extends ObjectScene {
	
	private int health;
	
	public Dino() {
		super();
	}
	
	public Dino(int x, int y, ImageIcon sprite, double velocity, int health) {
		super(x, y, sprite, velocity);
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
}
