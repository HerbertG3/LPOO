package jogo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Pista extends Carro {

	private int y =1;
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	public Pista(String img, int x, int y ){
		super (img, x, y);
		Image fundo;
		ImageIcon referencia = new ImageIcon();
		fundo = referencia.getImage();
	}
		
	public void mexer() {
		if(y<443)
		setY(getY()+1);
		if(y>=443){
			setY(-500);
		}
		System.out.println("posicao pista: "+y);
		
	}
	public void mexer1() {
		if(y<443)
		setY(getY()+1);
		if(y>=443){
			y=-600;
		}
		System.out.println("posicao pista1: "+y);
		
	}
}
