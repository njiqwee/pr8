package pr8;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import javax.swing.JTextPane;  

public class Pr8 extends JFrame {
    
	
    public Pr8() {
	City city = new City("Amogusland");
	Building building1 = new Building("Sasova", 1, 1000, city);
	Building building2 = new Building("Asasova", 1, 2600, city);
	ArrayList<String> res1 = new ArrayList();
	res1.add("sasov");
	res1.add("asasov");
	ArrayList<String> res2 = new ArrayList();
	res2.add("tosh");
	res2.add("irg");
	Apartment ap1 = new Apartment(1, 20, building1);
	ap1.addRes(res1);
	Apartment ap2 = new Apartment(1, 30, building2);
	ap2.addRes(res2);
	Office of1 = new Office(2, 45, building1, "NaoTou", "nasvainaya");
	Office of2 = new Office(2, 50, building2, "Tosh", "domKultury");
	////
	////
	setSize(500,500);
	setTitle("Tabbed Pane");
	JTabbedPane jtp = new JTabbedPane();
	getContentPane().add(jtp);
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	
	DefaultListModel<String> l1 = new DefaultListModel<>(); 
	for(Basement x: building1.getBases()){
	    l1.addElement(x.report());
	}
	JList<String> list = new JList<>(l1);
	jp2.add(list);
	
	JButton b=new JButton("rent");  
	b.addActionListener((java.awt.event.ActionEvent e) -> {
	    String data = "";
	    data += building1.getBases().get(list.getSelectedIndex()).calculateMonthlyFee();
	    JLabel tempL = new JLabel(data);
	    JOptionPane.showMessageDialog(jtp,tempL);
	});    
	jp2.add(b);
	
	JTextPane pane = new JTextPane(); 
	pane.setText(building1.report());
	jp1.add(pane);
	
	
	
	jtp.addTab("Tab1", jp1);
	jtp.addTab("Tab2", jp2);
    }
    
    public static void main(String[] args) {
    Pr8 tp = new Pr8();
    tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    tp.setVisible(true);
    }
    
}