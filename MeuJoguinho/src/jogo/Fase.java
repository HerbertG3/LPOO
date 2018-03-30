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

	private Image fundo;
	private Player carro;
	private Obstaculo obs;
	private Timer timer;
	private Spawner spawner;
	
	
	public Fase() {
		
		setDoubleBuffered(true);
		setFocusable(true);
		addKeyListener(new TecladoAdapter());
		ImageIcon referencia = new ImageIcon("res\\fundo1.jpg");
		fundo = referencia.getImage();
		
		carro = new Player("res\\carro_6.gif",160,320);
		obs = new Obstaculo("res\\carro_1.gif",20 ,250);
		spawner = new Spawner();
		
		timer = new Timer(5,this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo, 0, 0, null);
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
		//obs.mexer();
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
