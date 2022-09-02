import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class DragPanel extends JPanel{
    
    ImageIcon image = new ImageIcon("smile.png");
    final int width = image.getIconWidth();
    final int height = image.getIconHeight();
    Point imageCorner;
    Point prevPT;
    
    
    DragPanel() {
        imageCorner = new Point(0,0);
        ClickListener clikListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clikListener);
        this.addMouseMotionListener(dragListener);        
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
    }
    
    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            prevPT = e.getPoint();
        }
    }
    
    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            Point currentPT = e.getPoint();
            imageCorner.translate(
                 
                    (int)(currentPT.getX() - prevPT.getX()),
                    (int)(currentPT.getY() - prevPT.getY())
            );
            prevPT = currentPT;
            repaint();
        }
    }
}
