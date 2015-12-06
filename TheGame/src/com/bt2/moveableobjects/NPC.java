package com.bt2.moveableobjects;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import com.bt2.main.Main;

public class NPC {

	public static boolean talking;
	String firstLine = new String();
	String secondLine = new String();
	String thirdLine = new String();
	
	public NPC() {
		
	}

	public void init() {
		
	}
	
	public void tick(double deltaTime) {
		
	}
	
	public void fillLine(String firstLine, String secondLine, String thirdLine) {
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.thirdLine = thirdLine;
	}
	
	public void firstLine(String firstLine) {
		this.firstLine = firstLine;
	}
	
	public void secondLine(String secondLine) {
		this.secondLine = secondLine;
	}
	
	public void thirdLine(String thirdLine) {
		this.thirdLine = thirdLine;
	}
	
	public void nextLine() {
		
	}
	
	Font font = new Font("Shotscript", 10, 30);
	
	public void render(Graphics2D g) {
		if(talking) {
		g.drawRect(100, Main.height - 250, Main.width - 200, 150);
		g.setColor(Color.BLACK);
		g.fillRect(101, Main.height - 249, Main.width - 201, 149);
		g.setColor(Color.WHITE);
		g.setFont(font);
		g.drawString(firstLine, 200, Main.height - 200);
		g.drawString(secondLine, 200, Main.height - 170);
		g.drawString(thirdLine, 200, Main.height - 140);
		g.setColor(Color.WHITE);
		}	
	}
}
