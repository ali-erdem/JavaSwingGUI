import javax.swing.JFrame;


public class DragPanelFrame extends JFrame{
    
    DragPanel dragPanel = new DragPanel();
    
    DragPanelFrame(){
        
        this.add(dragPanel);
        this.setTitle("Drag and Drop");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
