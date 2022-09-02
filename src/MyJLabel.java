import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class MyJLabel extends JLabel{
    MyJLabel(){
        
        ImageIcon image = new ImageIcon("coder.jpg");
        Border border = BorderFactory.createLineBorder(Color.green,5);
        
        this.setIcon(image);
        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.EAST);
        this.setForeground(new Color(064663));
        this.setFont(new Font("Times New Roman",Font.PLAIN,20));
        this.setIconTextGap(-200);
        this.setBackground(Color.black);
        this.setOpaque(true);
        this.setBorder(border);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setBounds(100,0,250,350);
        
        MyFrame frame = new MyFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(this);
        //frame.pack();
    }
}
