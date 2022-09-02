import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class MyJRadioButton extends JFrame implements ActionListener{

    JRadioButton novelButton;
    JRadioButton sciFictionButton;
    JRadioButton fantasticButton; 
    JRadioButton mysteryButton;
    JRadioButton thrillerButton;
    JRadioButton romanceButton;
    JRadioButton dystopiaButton;
    JRadioButton contemporaryButton; 
    ImageIcon novelIcon;
    ImageIcon sciFictionIcon;
    ImageIcon fantastIcon;
    ImageIcon mysteryIcon;
    ImageIcon thrillerIcon;
    ImageIcon romanceIcon;
    ImageIcon dystopiaIcon;
    ImageIcon contemporaryIcon;
    
    public MyJRadioButton(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4,3));
       
        novelIcon = new ImageIcon("book.png");
        sciFictionIcon = new ImageIcon("book.png");
        fantastIcon = new ImageIcon("book.png") ;
        mysteryIcon = new ImageIcon("book.png");
        thrillerIcon = new ImageIcon("book.png") ;
        romanceIcon = new ImageIcon("book.png");
        dystopiaIcon = new ImageIcon("book.png");
        contemporaryIcon = new ImageIcon("book.png");
    
        novelButton = new JRadioButton("Novel");
        sciFictionButton = new JRadioButton("Science Fiction");
        fantasticButton = new JRadioButton("Fantastic");
        mysteryButton = new JRadioButton("Mystery");
        thrillerButton = new JRadioButton("Thriller");
        romanceButton = new JRadioButton("Romance");
        dystopiaButton = new JRadioButton("Dystopia");
        contemporaryButton = new JRadioButton("Contemporary");
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(novelButton);
        buttonGroup.add(sciFictionButton);
        buttonGroup.add(fantasticButton);
        buttonGroup.add(mysteryButton);
        buttonGroup.add(thrillerButton);
        buttonGroup.add(romanceButton);
        buttonGroup.add(dystopiaButton);
        buttonGroup.add(contemporaryButton);
        
        novelButton.addActionListener(this);
        sciFictionButton.addActionListener(this);
        fantasticButton.addActionListener(this);
        mysteryButton.addActionListener(this);
        thrillerButton.addActionListener(this);
        romanceButton.addActionListener(this);
        dystopiaButton.addActionListener(this);
        contemporaryButton.addActionListener(this);
        
        novelButton.setIcon(novelIcon);
        sciFictionButton.setIcon(sciFictionIcon);
        fantasticButton.setIcon(fantastIcon);
        mysteryButton.setIcon(mysteryIcon);
        thrillerButton.setIcon(thrillerIcon);
        romanceButton.setIcon(romanceIcon);
        dystopiaButton.setIcon(dystopiaIcon);
        contemporaryButton.setIcon(contemporaryIcon);
        
        this.add(novelButton);
        this.add(sciFictionButton);
        this.add(fantasticButton);
        this.add(mysteryButton);
        this.add(thrillerButton);
        this.add(romanceButton);
        this.add(dystopiaButton);
        this.add(contemporaryButton);
        
        
        this.pack();
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == novelButton) {
            System.out.println("You chosed novel book.");
        }
        else if(e.getSource() == sciFictionButton){
            System.out.println("You chosed science fiction book.");
        }
        else if(e.getSource() == fantasticButton ){
            System.out.println("You chosed fantastic book.");
        }
        else if(e.getSource() == mysteryButton){
            System.out.println("You chosed mystery book.");
        }
        else if(e.getSource() == thrillerButton){
            System.out.println("You chosed thriller book.");
        }
        else if(e.getSource() == romanceButton){
            System.out.println("You chosed romance book.");
        }
        else if(e.getSource() == dystopiaButton){
            System.out.println("You chosed dystopia book.");
        }
        else if(e.getSource() == contemporaryButton){
            System.out.println("You chosed contemporary book.");
        }        
        else{
            System.out.println("You did not chose any book.");
        } 
            
    }
    
}
