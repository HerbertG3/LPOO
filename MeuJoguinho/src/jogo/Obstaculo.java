package jogo;


public class Obstaculo extends Carro{

	private boolean u = true;
	private boolean isVisible;
	

	public Obstaculo(String img, int x, int y) {
		super(img, x, y);
		// TODO Auto-generated constructor stub
		
		
	}
	
	@Override
	public void mexer() {
		
		if(getY()>-250&&u)
			setY(getY()-1);
		else {
			setY(getY()+1);
		}
		
		if(getY()==-250) {
			u=false;
		}
		if(getY()==250) {
			u=true;
		}
		System.out.println("Update dy: " + getY());
	}
	
	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	
}
