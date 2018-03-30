package jogo;

import java.awt.Image;


import javax.swing.ImageIcon;

public class Carro {

	private int x, y;
	private int dx, dy;
	private Image imagem;
	
	
	public Carro(String img, int x, int y) {
		
		ImageIcon referencia = new ImageIcon(img);
		imagem = referencia.getImage();
		
		this.x=x;
		this.y=y;
		
	}
	
	public void mexer() {
		
		x += dx;
		y += dy;
		System.out.println("posicao d x: "+ x);
		if(x<48)
			x=48;
		if(x>160)
			x=160;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Image getImagem() {
		return imagem;
	}
	
	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

}
