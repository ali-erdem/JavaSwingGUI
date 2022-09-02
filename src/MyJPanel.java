import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyJPanel extends JPanel{

    public MyJPanel() {
    
     ImageIcon icon = new ImageIcon("logo3.png");
       
       JLabel label = new JLabel();
       label.setText("Hello!");
       label.setIcon(icon);
       label.setVerticalAlignment(JLabel.TOP);
       label.setHorizontalAlignment(JLabel.LEFT);
       label.setBounds(100, 100, 70, 70);
       
       JPanel redPanel = new JPanel();
       redPanel.setBackground(Color.red);
       redPanel.setBounds(0,0,250,250);
       redPanel.setLayout(new BorderLayout());
       //redPanel.setLayout(null);
       
       JPanel bluePanel = new JPanel();
       bluePanel.setBackground(Color.blue);
       bluePanel.setBounds(250,0,250,250);
       bluePanel.setLayout(new BorderLayout());
       //bluePanel.setLayout(null);

       
       JPanel yellowPanel = new JPanel();
       yellowPanel.setBackground(Color.yellow);
       yellowPanel.setBounds(0,250,500,250);
       yellowPanel.setLayout(new BorderLayout());
       //yellowPanel.setLayout(null);
       
       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(750,750);
       frame.setTitle("Title of Frame");
       frame.setVisible(true);
       frame.setLayout(null);
       frame.add(redPanel);
       frame.add(bluePanel);
       frame.add(yellowPanel);
       yellowPanel.add(label);
    }
}
