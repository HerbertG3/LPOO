package jogo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.swing.JFrame;

public class ContainerDeJanelas extends JFrame{
	
	public ContainerDeJanelas() {
		add(new Fase());
		setTitle("Meu Primeiro Jogo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(275,480);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	static Som som = new Som();
	
	public static void main(String[] args) {
		
		new ContainerDeJanelas();
		som.executaSom("res\\InDaClub.wav");
	}

}
