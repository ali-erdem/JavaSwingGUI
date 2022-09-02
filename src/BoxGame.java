import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class BoxGame {
    
    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    
    
    BoxGame(){
        
       frame = new JFrame("Keybinding");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(450,450);
       frame.setLayout(null);
       
       label = new JLabel();
       label.setBackground(Color.red);
       label.setBounds(100,100,100,100);
       label.setOpaque(true);
              
       upAction = new UpAction();
       downAction = new DownAction();
       leftAction = new LeftAction();
       rightAction = new RightAction();
       
//       label.getInputMap().put(KeyStroke.getKeyStroke("w"), "upAction");
//       label.getActionMap().put("upAction",upAction);
//       
//       label.getInputMap().put(KeyStroke.getKeyStroke("s"), "downAction");
//       label.getActionMap().put("downAction", downAction);
//       
//       label.getInputMap().put(KeyStroke.getKeyStroke("a"), "leftAction");
//       label.getActionMap().put("leftAction", leftAction);
//       
//       label.getInputMap().put(KeyStroke.getKeyStroke("d"), "rightAction");
//       label.getActionMap().put("rightAction", rightAction);

       InputMap inputMap = label.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
       inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_W, 0), "upAction");
       inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_S, 0), "downAction");
       inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_A, 0), "leftAction");
       inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_D, 0), "rightAction");

       
       frame.add(label);
       frame.setVisible(true);

    }
    
    public class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()-10);
        }
    }
    
    public class DownAction extends  AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
           label.setLocation(label.getX(), label.getY()+10);
        }
    }
    
    public class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
           label.setLocation(label.getX()-10, label.getY());
        }
    }
    
    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
          label.setLocation(label.getX()+10, label.getY());
        }
        
    }
    
}
