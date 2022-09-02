
import javax.swing.JFrame;


public class MyAnimationGameFrame extends JFrame{
    
    MyAnimationGame game;
    
    MyAnimationGameFrame(){
        game = new MyAnimationGame();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(game);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }
    
}
