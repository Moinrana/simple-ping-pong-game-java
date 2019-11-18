import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;

class GamePanel extends JPanel implements ActionListener ,MouseMotionListener{
	public int ballX=290,ballY=580,paddleX =250 ;
	public int ballYspeed=7;
	public int ballXspeed=5;
	private Timer t;
	public GamePanel(){
		this.setBounds(0,0,600,700);
		this.setBackground(Color.WHITE);
		t= new Timer(20,this);
		t.start();
		//addActionListener(this);
		addMouseMotionListener(this);
	}
	public void paint(Graphics g){
		//super.paint(g);
		//draw the background
		g.setColor(new Color(7,138,145));
		g.fillRect(0,0,600,700);
		//draw the paddle
		g.setColor(new Color(115,28,49));
		g.fillRect(paddleX,600,100,10);
		//draw the ball
		g.setColor(new Color(16,4,51));
		g.fillOval(ballX,ballY,20,20);

	}
	public void actionPerformed(ActionEvent e){
		ballX = ballX+ballXspeed;
		ballY = ballY+ballYspeed;
		//checking if the ball is connected to the paddle....
		if(ballX >= paddleX && ballX <= paddleX + 100 && ballY >=580){
			ballYspeed = -7;
		}
		//checking the ball is inside the panel..
		if(ballY <= 0){
			ballYspeed = 7;
		}
		if(ballX+10 >= 570){
			ballXspeed = -5;
		}
		if(ballX-10 <= 0){
			ballXspeed = 5;
		}
		

		repaint();
	}
	public void mouseDragged(MouseEvent e){}
	public void mouseMoved(MouseEvent e){
		paddleX = e.getX();
		repaint();
	}

}