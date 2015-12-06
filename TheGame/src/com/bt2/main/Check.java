package com.bt2.main;

import java.awt.Point;

import com.bt2.generator.Block;
import com.bt2.generator.TileManager;
import com.bt2.managers.HealthManager;
import com.bt2.moveableobjects.Player;

public class Check {
	
	public static boolean CollisionPlayerBlock(Point p1, Point p2) {
		for(Block block : TileManager.blocks) {
			if(block.isSolid()) {
				if(block.contains(p1) || block.contains(p2)) {
					return true;
				}
			}
		}	
		return false;
	}	
}