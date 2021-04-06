package logic.objects;

import javax.swing.ImageIcon;

public class ObjectScene {
	
	private int x;
	
	private int y;
	
	private ImageIcon sprite;
	
	private double velocity;
	
	public ObjectScene() {
		
	}

	public ObjectScene(int x, int y, ImageIcon sprite, double velocity) {
		super();
		this.x = x;
		this.y = y;
		this.sprite = sprite;
		this.velocity = velocity;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ImageIcon getSprite() {
		return sprite;
	}

	public void setSprite(ImageIcon sprite) {
		this.sprite = sprite;
	}

	public double getVelocity() {
		return velocity;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}
	
}
