package com.bt2.main;

import java.awt.image.BufferedImage;

import com.bt2.images.Images;
import com.bt4.gop.main.SpriteSheet;
import com.bt4.gop.main.loadImageFrom;

public class Assets {

	SpriteSheet blocks = new SpriteSheet();
	public static SpriteSheet player = new SpriteSheet();
	
	public static BufferedImage stone1;
	public static BufferedImage wall1;
	public static BufferedImage inviswall1;
	
	
	public static BufferedImage mouse_pressed;
	public static BufferedImage mouse_unpressed;
	
	public static BufferedImage button_heldover;
	public static BufferedImage button_notover;
	
	public void init() {
		blocks.setSpriteSheet(loadImageFrom.LoadImageFrom(Images.class, "SpriteSheet.png"));
		player.setSpriteSheet(loadImageFrom.LoadImageFrom(Images.class, "PlayerSheet.png"));
		
		button_heldover = player.getTile(160, 32, 48, 16);
		button_notover = player.getTile(112, 32, 48, 16);
		
		stone1 = blocks.getTile(0, 0, 16, 16);
		wall1 = blocks.getTile(16, 0, 16, 16);
		inviswall1 = blocks.getTile(0, 0, 16, 16);
		
		mouse_pressed = player.getTile(104, 8, 8, 8);
		mouse_unpressed = player.getTile(96, 8, 8, 8);
		
		Fonts.addFont(new Fonts("Shotscript.ttf"));
	}
	
	public static BufferedImage getInviswall1() {
		return inviswall1;
	}
	
	public static BufferedImage getStone1() {
		return stone1;
	}
	
	public static BufferedImage getWall1() {
		return wall1;
	}
	
	public static BufferedImage getMouse_pressed() {
		return mouse_pressed;
	}
	
	public static BufferedImage getMouse_unpressed() {
		return mouse_unpressed;
	}
	
	public static BufferedImage getButton_heldover() {
		return button_heldover;
	}
	
	public static BufferedImage getButton_notover() {
		return button_notover;
	}
	
}
