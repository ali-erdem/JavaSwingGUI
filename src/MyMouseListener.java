import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyMouseListener extends JFrame implements MouseListener{

    JLabel label;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;
    ImageIcon dizzy;
    
    public MyMouseListener() {
        
        smile = new ImageIcon("smile.jpg");
        nervous = new ImageIcon("nervous.jpg");
        pain = new ImageIcon("pain.png");
        dizzy = new ImageIcon("dizzy.png");
        
        label = new JLabel();
//        label.setBounds(0,0,100,100);
//        label.setBackground(Color.red);
//        label.setOpaque(true);
        label.addMouseListener(this);
//        this.addMouseListener(this);
       
        label.setIcon(smile);
        label.setIcon(nervous);
        label.setIcon(pain);
        label.setIcon(dizzy);
        
        this.add(label);
        this.setLocationRelativeTo(null);
        this.pack();
//        this.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);
        this.setVisible(true);

    }

    
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("You clicked the mouse");
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("You pressed the mouse");
//        label.setBackground(Color.black);
//        label.setLocation(10,20);
        label.setIcon(nervous);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("You released the mouse");
//        label.setBackground(Color.yellow);
//        label.setLocation(20,30);
       label.setIcon(pain);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You entered the mouse");
//        label.setBackground(Color.blue);
//        label.setLocation(30,40);
        label.setIcon(dizzy);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You exited the mouse");
//        label.setBackground(Color.red);
//        label.setLocation(40,50);
        label.setIcon(smile);
    }
    
}
