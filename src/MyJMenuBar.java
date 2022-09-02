
import com.sun.glass.events.KeyEvent;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MyJMenuBar extends JFrame implements ActionListener{
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;
    JButton button;
    
    public MyJMenuBar(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setTitle("MenuBar");
        
        loadIcon = new ImageIcon("load.png");
        saveIcon = new ImageIcon("save2.png");
        exitIcon = new ImageIcon("exit.png");
        
        menuBar = new JMenuBar();
        
        
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");
        
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        
        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        
        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for file
        saveItem.setMnemonic(KeyEvent.VK_E); // Alt + e for file
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for file
        loadItem.setMnemonic(KeyEvent.VK_L); // Alt + l for file
        saveItem.setMnemonic(KeyEvent.VK_S); // Alt + s for file
        exitItem.setMnemonic(KeyEvent.VK_E); // Alt + e for file
        
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        
        button = new JButton("Select a file");
        button.addActionListener(this);
        
        this.add(button);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == loadItem){
            System.out.println("You loaded a file");
        }
        if(e.getSource() == saveItem){
            System.out.println("You saved a file");
        }
        if(e.getSource() == exitItem){
            System.out.println(0);
        }
        
        if(e.getSource() == button){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("file path..."));
//            int response = fileChooser.showOpenDialog(null);
            int response = fileChooser.showSaveDialog(null);
            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
       
    }
}
