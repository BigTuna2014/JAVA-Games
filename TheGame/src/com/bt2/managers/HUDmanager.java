package com.bt2.managers;

import java.awt.Color;
import java.awt.Graphics2D;

import com.bt2.generator.World;
import com.bt2.main.Main;
import com.bt2.moveableobjects.Player;

public class HUDmanager {

	private World world;
	
	public HUDmanager(World world) {
		this.world = world;
		
	}
	
	public void init() {

	}
	
	public void tick(double deltaTime) {
		
	}
	
	public void render(Graphics2D g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Main.width, Main.height / 6);
		g.fillRect(0, 750, Main.width, Main.height);
		g.setColor(Color.WHITE);
		
		if(world.getPlayer().isDebuging()) { 
			g.drawString("[DEBUG]", 30, 30);
			g.drawString("[MapXpos] " + world.getWorldXPos(), 30, 60);
			g.drawString("[MapYpos] " + world.getWorldYPos(), 30, 90);
			g.drawString("[PlayerXpos] " + world.getPlayer().getPos().xpos, 30, 120);
			g.drawString("[PlayerXpos] " + world.getPlayer().getPos().ypos, 30, 150);
			g.drawString("[Current World Blocks] " + world.getWorldBlocks().getBlocks().size(), 30, 180);
			g.drawString("[Current Loaded World Blocks] " + world.getWorldBlocks().getLoadedBlocks().size(), 30, 210);
		}
		
	}
	
}