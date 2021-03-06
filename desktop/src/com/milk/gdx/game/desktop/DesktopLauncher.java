package com.milk.gdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.milk.gdx.game.EscapeTheRoom;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 425;
		config.height = 220;
		new LwjglApplication(new EscapeTheRoom(), config);
	}
}
