package com.bt2.gamestates;

import java.awt.Graphics2D;

import com.bt2.gamestate.GameState;
import com.bt2.gamestate.GameStateButton;
import com.bt2.gamestate.GameStateManager;
import com.bt2.main.Main;
import com.bt2.managers.MouseManager;

public class QuitState extends GameState {
	
	GameStateButton yes;
	GameStateButton no;
	MouseManager mm;
	
	public QuitState(GameStateManager gsm) {
		super(gsm);
	}

	@Override
	public void init() {
		mm = new MouseManager();
		yes = new GameStateButton(Main.width / 2 - 100, 100, "Yes");
		no = new GameStateButton(Main.width / 2 + 100, 100, "No");
	}

	@Override
	public void tick(double deltaTime) {
		mm.tick();
		yes.tick();
		no.tick();
		
		if(yes.isHeldOver()) {
			if(yes.isPressed()) {
				System.exit(1);
			}
		}
		if(no.isHeldOver()) {
			if(no.isPressed()) {
				gsm.states.push(new MenuState(gsm));
				gsm.states.peek().init();
			}
		}
	}

	@Override
	public void render(Graphics2D g) {
		yes.render(g);
		no.render(g);
		mm.render(g);
		g.clipRect(0, 0, Main.width, Main.height);
	}

}
