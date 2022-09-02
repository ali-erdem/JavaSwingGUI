import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class MyJSliders implements ChangeListener{

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    
    MyJSliders() {
        frame = new JFrame("Slider");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);
        
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setFont(new Font("Times New Roman",Font.BOLD,15));
        slider.setForeground(Color.red);
//        slider.setOrientation(SwingConstants.HORIZONTAL);
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);
        label.setText("°C = " +slider.getValue());
        
       
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    
    
    @Override
    public void stateChanged(ChangeEvent e) {

        label.setText("°C = " +slider.getValue());
        
    } 
}
