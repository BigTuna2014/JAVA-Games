package com.bt2.moveableobjects;

import java.awt.Color;
import java.awt.Graphics2D;

import com.bt4.gop.main.Vector2F;

public class TestEnemy {

	Vector2F pos = new Vector2F();
	
	public TestEnemy() {
		pos = new Vector2F(200, 200);
	}

	public void init() {
		
	}
	
	public void tick(double deltaTime) {
		
	}
	
	public void render(Graphics2D g) {
		g.setColor(Color.white);
		/*g.drawRect((int)pos.xpos, (int)pos.ypos, 32, 32);
		g.fillRect((int) pos.xpos, (int) pos.ypos, 32, 32);*/
	}
	
}