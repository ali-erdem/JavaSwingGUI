
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MyJoptionPane extends JOptionPane{

    public MyJoptionPane() {
        
        JOptionPane.showMessageDialog(null, "This is not useless information.", "Title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is a information message.", "Title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is a question message", "Title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is a warning message", "Title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is a error message", "Title", JOptionPane.ERROR_MESSAGE);

//        while(true){//Since there is an infinite loop in this of code part, it will give an (unreachable statement) error.
//            JOptionPane.showMessageDialog(null, "This is a virus.", "Virus", JOptionPane.QUESTION_MESSAGE);
//        }

        JOptionPane.showConfirmDialog(null, "My friend, do you want to code?", "Question Title", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println(JOptionPane.showConfirmDialog(null, "My friend, do you want to code?", "Question Title", JOptionPane.YES_NO_CANCEL_OPTION));
        
//          while(true){//Since there is an infinite loop in this of code part, it will give an (unreachable statement) error.
//          int answer = JOptionPane.showConfirmDialog(null, "Hi, are you coder?", "Question", JOptionPane.YES_NO_CANCEL_OPTION);          
//          if(answer == 0){
//              System.out.println("Your answer is yes.");
//            
//          }
//          else if(answer == 1){
//              System.out.println("Your answer is no");
//               
//          }
//          else if(answer == 2){
//              System.out.println("Your answer is cancel");
//               
//          }
//          else if(answer == -1){
//              System.out.println("Your answer is not anything.");
//               
//          }
//          else{
//              System.out.println("Dont correct");
//               
//          }
//        }
          
        String[] responses = {"No,you are awesome","Thank you","I'm blush :)"};
        ImageIcon icon = new ImageIcon("smile.png");
        JOptionPane.showOptionDialog
        (null, "You are awesome", "Title", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses,0);

    }
}
