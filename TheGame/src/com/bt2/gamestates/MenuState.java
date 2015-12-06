package com.bt2.gamestates;

import java.awt.Graphics2D;

import com.bt2.gamestate.GameState;
import com.bt2.gamestate.GameStateButton;
import com.bt2.gamestate.GameStateManager;
import com.bt2.main.Main;
import com.bt2.managers.MouseManager;

public class MenuState extends GameState {
	
	GameStateButton startGame;
	GameStateButton multiplayer;
	GameStateButton options;
	GameStateButton quit;
	MouseManager mm;
	
	public MenuState(GameStateManager gsm) {
		super(gsm);
	}

	@Override
	public void init() {
		mm = new MouseManager();
		startGame = new GameStateButton(Main.width / 3, 200, new TheGameLevelLoader(gsm), gsm, "Play");
		multiplayer = new GameStateButton(Main.width / 3, 300, new TheGameLevelLoader(gsm), gsm, "Multiplayer");
		options = new GameStateButton(Main.width / 3, 400, new TheGameLevelLoader(gsm), gsm,  "Options");
		quit = new GameStateButton(Main.width / 3, 500, new QuitState(gsm), gsm, "Quit");
	}

	@Override
	public void tick(double deltaTime) {
		mm.tick();
		startGame.tick();
		multiplayer.tick();
		options.tick();
		quit.tick();
	}

	@Override
	public void render(Graphics2D g) {
		startGame.render(g);
		multiplayer.render(g);
		options.render(g);
		quit.render(g);
		mm.render(g);
		g.clipRect(0, 0, Main.width, Main.height);
	}

}
