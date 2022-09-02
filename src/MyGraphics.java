import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;



public class MyGraphics extends JFrame{
    
    Image image;
    
    MyGraphics(){
//        this.setUndecorated(true);
        image = new ImageIcon("sky.png").getImage();
        this.setTitle("Graphics");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        
    }
    public void paint(Graphics g){
        
        Graphics2D g2D = (Graphics2D)g;
//        
//        g2D.setPaint(Color.blue);
//        g2D.drawLine(0, 0, 500, 500);
//        g2D.setStroke(new BasicStroke(5));
//        
//        g2D.setPaint(Color.yellow);
//        g2D.drawRect(0, 0, 100, 200);
//        g2D.fillRect(0, 0, 100, 200);
//        
//        g2D.setPaint(Color.black);
//        g2D.drawOval(200, 150, 100, 200);
//        g2D.fillOval(100, 50, 100, 200);
//        
        g2D.setPaint(Color.red);
        g2D.drawArc(200, 200, 100, 100, 0, 180);
        g2D.fillArc(200, 200, 100, 100, 0, 180);
        
        g2D.setPaint(Color.black);
        g2D.drawArc(200, 200, 100, 100, 0, 180);
        g2D.fillArc(200, 200, 100, 100, 180, 180);
        
        int [] xPoints = {150,250,350};
        int [] yPoints = {300,150,300};
        g2D.setPaint(Color.yellow);
//        g2D.drawPolygon(xPoints,yPoints,3);
        g2D.fillPolygon(xPoints,yPoints,3);
//       
//
//        g2D.setPaint(Color.orange);
//        g2D.setFont(new Font("Times New Roman", Font.BOLD,50));
//        g2D.drawString("You are awesome", 100, 100);
        
//          g2D.drawImage(image,0,0,null);
          
          
    }
}
