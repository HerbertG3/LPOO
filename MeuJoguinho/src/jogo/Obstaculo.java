package jogo;


public class Obstaculo extends Carro{

	private boolean u = true;
	private boolean isVisible;
	

	public Obstaculo(String img, int x, int y) {
		super(img, x, y);
		// TODO Auto-generated constructor stub
		
		
	}
	
	public void mexer() {
		
		setY(getY()+2);
		System.out.println("Update dy: " + getY());
	}
	
	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	
}
