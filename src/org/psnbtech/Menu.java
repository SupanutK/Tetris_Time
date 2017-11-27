package org.psnbtech;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Menu {
	public static Rectangle playButton = new Rectangle(Tetris.WIDTH / 2 + 90, 250, 100, 50);
	public static Rectangle quitButton = new Rectangle(Tetris.WIDTH / 2 + 90, 350, 100, 50);

	public static void render(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		Font fnt0 = new Font("arial", Font.BOLD, 35);
		g.setFont(fnt0);
		g.setColor(Color.GREEN);
		g.drawString("    Tetris Time", Tetris.WIDTH / 2, 100);

		Font fnt1 = new Font("arial",Font.BOLD,30);
		g.setFont(fnt1);
		g.drawString("Start", playButton.x+15 , playButton .y+35);
		g.drawString("Exit", quitButton.x+15 , quitButton .y+35);
		g2d.draw(playButton);
		g2d.draw(quitButton);
	}
}
