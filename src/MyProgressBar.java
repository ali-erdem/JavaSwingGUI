
import java.awt.Color;
import java.awt.Font;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JProgressBar;


public class MyProgressBar {
    
    JFrame frame = new JFrame();
    JProgressBar progressBar = new JProgressBar(0,500);
    
    public MyProgressBar() {
        
        progressBar.setValue(0);
        progressBar.setBounds(0,0,400,50);
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font("Times New Roman",Font.BOLD,25));
        progressBar.setBackground(Color.red);
        progressBar.setForeground(Color.yellow);
        
        frame.add(progressBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        
//       fill();
       fill2();
    }
    
//   public void fill(){ //increase
//       int counter = 0;
//       while(counter > 0){
//        progressBar.setValue(counter);
//           try {
//               Thread.sleep(50);
//           } catch (InterruptedException e) {
//               e.printStackTrace();
//           }
//           counter += 1;
//       }
//      progressBar.setString("Done");
//   }
   
   public void fill2(){ //decrease
       int counter = 500;
       while(counter > 0 ){
        progressBar.setValue(counter);
           try {
               Thread.sleep(50);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           counter -= 1;
       }
      progressBar.setString("Done");
   }
   
   
}
