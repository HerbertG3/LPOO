package jogo;
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
	
	public static void main(String[] args) {
		new ContainerDeJanelas();
	}

}
