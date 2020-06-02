package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MaintenanceAdder extends JFrame {
	
	public MaintenanceAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("Maintenance Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelYear = new JLabel("Maintenance Year: ", JLabel.TRAILING);
		JTextField fieldYear = new JTextField(10);
		labelYear.setLabelFor(fieldYear);
		panel.add(labelYear);
		panel.add(fieldYear);
		
		JLabel labelDistance = new JLabel("Driven Distance: ", JLabel.TRAILING);
		JTextField fieldDistance = new JTextField(10);
		labelDistance.setLabelFor(fieldDistance);
		panel.add(labelDistance);
		panel.add(fieldDistance);
		
		JLabel labelWorkshop = new JLabel("Workshop: ", JLabel.TRAILING);
		JTextField fieldWorkshop = new JTextField(10);
		labelWorkshop.setLabelFor(fieldWorkshop);
		panel.add(labelWorkshop);
		panel.add(fieldWorkshop);
		
		panel.add(new JButton("Save"));
		panel.add(new JButton("Cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}