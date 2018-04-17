package jogo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fase extends JPanel implements ActionListener{

	private Player carro;
	private Timer timer;
	private Spawner spawner;
	boolean ok = false;
	private Pista pista;
	private Pista pista1;
	int i=0;
	
	public Fase() {
		
		setDoubleBuffered(true);
		setFocusable(true);
		addKeyListener(new TecladoAdapter());
		
		carro = new Player("res\\carro_6.gif",160,320);
		spawner = new Spawner();
		pista = new Pista("res\\fundo1.jpg", 0, 0);
		pista1 = new Pista("res\\fundo2.jpg", 0, -500);
		timer = new Timer(5,this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		i++;
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(pista.getImagem(), 0, pista.getY(), null);
		graficos.drawImage(pista1.getImagem(), 0, pista1.getY(), null);
		graficos.drawImage(carro.getImagem(), carro.getX(), carro.getY(), this);
		
		Graphics2D graficos1 = (Graphics2D) g;	
		List<Obstaculo> oponente = spawner.getOponente();
		for(int i=0;i<oponente.size();i++) {
			
			Obstaculo o = (Obstaculo) oponente.get(i);
			graficos1.drawImage(o.getImagem(), o.getX()+50, o.getY()+100, this);
		}
		
		System.out.println(oponente.size());
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		List<Obstaculo> oponente = spawner.getOponente();
		
		for(int i=0;i<oponente.size();i++) {
			
			Obstaculo o = (Obstaculo) oponente.get(i);
			
			o.mexer();
			
		}
		System.out.println(oponente.size());
		carro.mexer();
		if(!ok)
		spawner.time();
		pista.mexer();
		pista1.mexer1();
		System.out.println("Imprimindo");
		ok=true;
		repaint();
		
	}
	
	private class TecladoAdapter extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			carro.keyPressed(e);
			int codigo = e.getKeyCode();
			
			if(codigo == KeyEvent.VK_SPACE) {
				spawner.Spawn();
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			carro.keyReleased(e);
		}
		
	}
	
	
}
