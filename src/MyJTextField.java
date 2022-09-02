
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class MyJTextField extends JTextField implements ActionListener{
    
    JButton button;
    JTextField textField;
    
    public MyJTextField() {
    
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        button = new JButton("Submit");
        button.addActionListener(this);
        
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Times New Roman", Font.ITALIC,25));   
        textField.setForeground(Color.yellow);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.GREEN);
        textField.setText("username");
        
        
        frame.add(button);
        frame.add(textField);
        frame.pack();
        frame.setVisible(true);
                
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("Welcome " + textField.getText());
            button.setEnabled(true); //or false
            textField.setEditable(true);  // or false 
        }
    }
    
}
