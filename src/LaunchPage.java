
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{
    
   JFrame myFrame = new JFrame("Title of Frame in here");
   JButton myButton = new JButton("Press for the New Window");
   
    public LaunchPage() {
        
        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
       
        myFrame.add(myButton);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(500,500);
        myFrame.setLayout(null);
        myFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == myButton){
            myFrame.dispose();
            NewWindow myNewWindow = new NewWindow();
        }
    }
}
