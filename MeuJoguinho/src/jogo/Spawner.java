package jogo;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Spawner {

	private int x;
	private List<Obstaculo> oponente;
	private Timer timer;
	private TimerTask task;
	private Random gerador = new Random();
	private int seg = 5;
	
	public Spawner() {
		oponente = new ArrayList<Obstaculo>();
		
	}
	
	public List<Obstaculo> getOponente() {
		return oponente;
	}
	
	public void Spawn() {
		x = gerador.nextInt(9);
		switch (x) {
		case 0:
			this.oponente.add(new Obstaculo("res\\carro_1.gif",0 ,-250));
			break;
		case 1:
			this.oponente.add(new Obstaculo("res\\carro_2.gif",55 ,-250));
			break;
		case 2:
			this.oponente.add(new Obstaculo("res\\carro_3.gif",110 ,-250));
			break;
		case 3:
			this.oponente.add(new Obstaculo("res\\carro_4.gif",0 ,-250));
			break;
		case 4:
			this.oponente.add(new Obstaculo("res\\carro_5.gif",55 ,-250));
			break;
		case 5:
			this.oponente.add(new Obstaculo("res\\carro_3.gif",110 ,-250));
			break;
		case 6:
			this.oponente.add(new Obstaculo("res\\carro_5.gif",0 ,-250));
			break;
		case 7:
			this.oponente.add(new Obstaculo("res\\carro_4.gif",55 ,-250));
			break;
		case 8:
			this.oponente.add(new Obstaculo("res\\carro_2.gif",110 ,-250));
			break;
		case 9:
			this.oponente.add(new Obstaculo("res\\carro_1.gif",110 ,-250));
			break;

		default:
			break;
		}
		
		seg = gerador.nextInt(10);
	}
	
	public void time() {
		
		timer = new Timer();
		task = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Spawn();
			}
		};
		timer.scheduleAtFixedRate(task, 5, 1000 * seg);
	}
	
	public void keyPressed(KeyEvent tecla) {
		
		int codigo = tecla.getKeyCode();
		
		
		if(codigo == KeyEvent.VK_SPACE) {
			Spawn();
		}	
	}
	
}
