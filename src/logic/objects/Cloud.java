package logic.objects;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Cloud extends ObjectScene {
	
	public Cloud() {
		super();
		
		ImageIcon spriteCloud = new ImageIcon("./img/cloud/nube_1.png");
		Image cloudResize = spriteCloud.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
		spriteCloud = new ImageIcon(cloudResize);
		super.setSprite(spriteCloud);
	}
	
	public Cloud(int x, int y, ImageIcon sprite, double velocity) {
		super(x, y, sprite, velocity);		
	}

}
