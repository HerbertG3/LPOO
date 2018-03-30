package jogo;

import java.awt.event.KeyEvent;

public class Player extends Carro{

	public Player(String img, int x, int y) {
		super (img, x, y);
		
	}
	
public void keyPressed(KeyEvent tecla) {
		
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_UP) {
			setDy(-1);
		}
		if(codigo == KeyEvent.VK_DOWN) {
			setDy(1);
		}
		if(codigo == KeyEvent.VK_LEFT) {
			if(getX()>48)
				setDx(-2);
			else
				setDx(0);
		}
		if(codigo == KeyEvent.VK_RIGHT) {
			if(getX()<160)
				setDx(2);
			else
				setDx(0);
			
		}	
	}
	
	public void keyReleased(KeyEvent tecla) {
		
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_UP) {
			setDy(0);
		}
		if(codigo == KeyEvent.VK_DOWN) {
			setDy(0);
		}
		if(codigo == KeyEvent.VK_LEFT) {
			setDx(0);
		}
		if(codigo == KeyEvent.VK_RIGHT) {
			setDx(0);
		}
		
		
	}
}
