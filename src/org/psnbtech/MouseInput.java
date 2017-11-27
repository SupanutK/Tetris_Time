package org.psnbtech;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int mx= e.getX();
		int my= e.getY();
		/*public static Rectangle playButton = new Rectangle(Tetris.WIDTH / 2 + 90, 250, 100, 50);
		public static Rectangle quitButton = new Rectangle(Tetris.WIDTH / 2 + 90, 350, 100, 50);
		*/
		//playBotton
		if(mx >= Tetris.WIDTH/2 +90 && mx <= Tetris.WIDTH/2+190){
			if(my >= 280 && my <= 330){
				//Pressed playButton
				BoardPanel.State = BoardPanel.STATE.GAME;
				Tetris.State = Tetris.STATE.GAME;
			}
		} 
		//quitBotton
		if(mx >= Tetris.WIDTH/2 +90 && mx <= Tetris.WIDTH/2+190){
			if(my >= 380 && my <= 430){
				//Pressed playButton
			System.exit(1);
			}
		} 
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
