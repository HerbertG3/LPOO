package jogo;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Spawner {

	//private int altura, largura;
	private List<Obstaculo> oponente;
	
	
	public Spawner() {
		oponente = new ArrayList<Obstaculo>();
		
	}
	
	public List<Obstaculo> getOponente() {
		return oponente;
	}
	
	public void Spawn() {
		this.oponente.add(new Obstaculo("res\\carro_1.gif",20 ,250));
	}
	
	public void keyPressed(KeyEvent tecla) {
		
		int codigo = tecla.getKeyCode();
		
		
		if(codigo == KeyEvent.VK_SPACE) {
			Spawn();
		}	
	}
	
}
