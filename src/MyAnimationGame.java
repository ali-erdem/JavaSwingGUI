import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyAnimationGame extends JPanel implements ActionListener{
    
    final int panel_width = 500;
    final int panel_height = 500;
    Image alien;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;
    
    MyAnimationGame(){
        this.setPreferredSize(new Dimension(panel_width,panel_height));
        this.setBackground(Color.BLACK);
        alien = new ImageIcon("enemy.png").getImage();
        backgroundImage = new ImageIcon("space.png").getImage();
        timer = new Timer(10,this);
        timer.start();
    }
    
    public void paint(Graphics g){
        
        super.paint(g);
        Graphics2D gd = (Graphics2D) g;
        gd.drawImage(backgroundImage,0,0,null);
        gd.drawImage(alien,x,y, null);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(x>=panel_width-alien.getWidth(null) || x<0){
            
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;
        if(y>=panel_height-alien.getWidth(null) || y<0){
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        repaint();
    }
}
