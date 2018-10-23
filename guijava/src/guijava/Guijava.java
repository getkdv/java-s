package guijava;
import javax.swing.*;
public class Guijava {

    public static void main(String[] args) {
    
        JFrame j=new JFrame("WELCOME JAVA");
        JButton b1=new JButton("Click Here");
        b1.setSize(500, 700);
        JTextField jf=new JTextField();
        j.add(b1);
        j.add(jf);
        j.setEnabled(true);
        j.setVisible(true);
        
    }
    
}
