import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class MyColorChooser extends JFrame implements ActionListener{
    
    JButton button;
    JLabel label;
 
    MyColorChooser() {
               
        button = new JButton("Pick a color");
        button.addActionListener(this);
        
        
        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("This is some text");
        label.setFont(new Font("Times New Roman",Font.PLAIN,50));
        label.setOpaque(true);
        
       
        this.add(button);
        this.add(label);
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500,150);
//        this.pack();
        this.setLayout(new FlowLayout());
       
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null,"Color", Color.red);
//            label.setForeground(color);
            label.setBackground(color);
        }
    }
}
