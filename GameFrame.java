import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GameFrame extends JFrame{
	JPanel p;
	public GameFrame(){
		this.setSize(600,700);
		this.setTitle("PiNg PoNg");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setComponent();
	}
	public void setComponent(){
		this.p = new GamePanel();
		this.add(p);
	}

}