import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyKeyListener extends JFrame implements KeyListener{
    
    JLabel label;
    ImageIcon icon;
    
    MyKeyListener(){
        
        icon = new ImageIcon("rocket.png");
        label = new JLabel();
        label.setBounds(10,10,120,120);
//        label.setBackground(Color.red);
//       label.setOpaque(true);
        label.setIcon(icon);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setTitle("Move to the rocket");
        this.setLayout(null);
        this.addKeyListener(this);
        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);
       
        
    }
    
   
    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()){
            case 'a': label.setLocation(label.getX()-5, label.getY());
            break;
            case 'w': label.setLocation(label.getX(), label.getY()-5);
            break;
            case 'd': label.setLocation(label.getX()+5, label.getY());
            break;
            case 's': label.setLocation(label.getX(),label.getY()+5);
            break;
            
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case 65: label.setLocation(label.getX()-5, label.getY());
            break;
            case 87: label.setLocation(label.getX(), label.getY()-5);
            break;
            case 68: label.setLocation(label.getX()+5, label.getY());
            break;
            case 83: label.setLocation(label.getX(),label.getY()+5);
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You released this key char: " + e.getKeyChar());
        System.out.println("You released this key code: " +e.getKeyCode());
    }
    
}
