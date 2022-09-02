
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;



public class MyJComboBoxes extends JFrame implements ActionListener{

    JComboBox comboBox;
    JComboBox comboBox2;

    public MyJComboBoxes() throws HeadlessException {
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        String[] animals = {"dog","bird","cat","horse"};
        Integer[] animals2 = {1,2,3,4};
        
        comboBox = new JComboBox(animals);
        comboBox2 = new JComboBox(animals2);
        comboBox.addActionListener(this);
        
        
//        comboBox.setEditable(true);
//        System.out.println(comboBox.getItemCount());
//        comboBox.addItem("tiger");
//        comboBox.insertItemAt("monkey",0);
//        comboBox.setSelectedIndex(0);
//        comboBox.removeItem("tiger");
//        comboBox.removeItemAt(1);
//        comboBox.removeAllItems();


        this.add(comboBox);
        this.add(comboBox2);
        this.pack();
        this.setVisible(true);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == comboBox){
            System.out.println("Name of animals: " +comboBox.getSelectedItem() 
                   +" ------> " + " Sequence of animals in this code's array: " +comboBox.getSelectedIndex());
        }
        
    }
    
}
