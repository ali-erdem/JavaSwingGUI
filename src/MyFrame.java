import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame extends JFrame implements ActionListener{
    
    JButton button;
    JLabel label;
    MyFrame(){
        
        ImageIcon image = new ImageIcon("logo2.jpg"); //create an ImageIcon
        ImageIcon image2 = new ImageIcon("button.png");
        ImageIcon image3 = new ImageIcon("face.jpg");
        
        label = new JLabel();
        label.setIcon(image3);
        label.setBounds(150,250,150,150);
        label.setVisible(false);
        
        button = new JButton();
        button.setBounds(100, 100, 250, 70);
        button.addActionListener(this);
        button.setText("Press the this button");
        button.setFocusable(false);
        button.setIcon(image2);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Times New Roman",Font.BOLD,15));
        //button.setIconTextGap(-15);
        button.setForeground(Color.BLACK);
        button.setBackground(Color.GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        
        
        this.setIconImage(image.getImage()); 
        this.getContentPane().setBackground(new Color(255,255,255)); 
        this.setTitle("Frame Title In Here"); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setLayout(null);
        this.setSize(500,500); 
       // this.setResizable(false); 
        this.setVisible(true); 
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            //System.out.println("You pressed the button!");
            //button.setEnabled(false);
           label.setVisible(true);
        }
    }
}
