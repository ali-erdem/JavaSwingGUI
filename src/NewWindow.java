
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
        
        JFrame myFrame = new JFrame("New Window");
        JLabel myLabel = new JLabel("Hi, how are you?");

       NewWindow() {
           myLabel.setBounds(0, 0, 100, 100);
           myLabel.setFont(new Font("Times New Roman",Font.BOLD,10));
           myFrame.add(myLabel);
           myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           myFrame.setSize(400,400);
           myFrame.setLayout(null);
           myFrame.setVisible(true);
    }
    
}
