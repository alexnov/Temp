import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



/**
 * @author Aleksandr Krivoshey
 */
public class Temp2 extends JFrame {
	
	//Температура нейтрального слоя
		public static Double tnt = 11.0;
		//Статическая температура на забое
		public static Double tzb = (double) 100;
		//Температура выходящего бурового раствора
		public static Double tbr = (double) 45;
		//Температура затворяемого раствора
		public static Double tzr = (double) 15;
		//Глубина забоя
		public static Double hz = (double) 3000;
		//Динамическая температура на забое
		public Double din;
		
		public static Double calculate_dinamic(double tnt, double tzb, double tzr, double hz){
			Double dinamic = (double) (Math.round((1.15*(tnt + tzb - tbr) - (tbr - tzr)/(0.0025*hz))*100))/100;
			return dinamic;
		}
	
	
	public Temp2() {
		initComponents();
		
	}

	private void textField1ActionPerformed(ActionEvent e) {
		// TODO add your code here
		String st1 = this.textField1.getText();
		tnt = Double.parseDouble(st1);
		String beginvalue = calculate_dinamic(tnt, tzb, tzr, hz).toString();
		this.textField6.setText(beginvalue);
	}

	private void textField2ActionPerformed(ActionEvent e) {
		// TODO add your code here
		String st1 = this.textField2.getText();
		tzb = Double.parseDouble(st1);
		String beginvalue = calculate_dinamic(tnt, tzb, tzr, hz).toString();
		this.textField6.setText(beginvalue);
	}

	private void textField3ActionPerformed(ActionEvent e) {
		// TODO add your code here
		String st1 = this.textField3.getText();
		tbr = Double.parseDouble(st1);
		String beginvalue = calculate_dinamic(tnt, tzb, tzr, hz).toString();
		this.textField6.setText(beginvalue);
	}

	private void textField4ActionPerformed(ActionEvent e) {
		// TODO add your code here
		String st1 = this.textField4.getText();
		tzr = Double.parseDouble(st1);
		String beginvalue = calculate_dinamic(tnt, tzb, tzr, hz).toString();
		this.textField6.setText(beginvalue);
	}

	private void textField5ActionPerformed(ActionEvent e) {
		// TODO add your code here
		String st1 = this.textField5.getText();
		hz = Double.parseDouble(st1);
		String beginvalue = calculate_dinamic(tnt, tzb, tzr, hz).toString();
		this.textField6.setText(beginvalue);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Aleksandr Krivoshey
		panel1 = new JPanel();
		label1 = new JLabel();
		textField1 = new JTextField();
		panel2 = new JPanel();
		label2 = new JLabel();
		textField2 = new JTextField();
		panel3 = new JPanel();
		label3 = new JLabel();
		textField3 = new JTextField();
		panel4 = new JPanel();
		label4 = new JLabel();
		textField4 = new JTextField();
		panel5 = new JPanel();
		label5 = new JLabel();
		textField5 = new JTextField();
		panel6 = new JPanel();
		label6 = new JLabel();
		textField6 = new JTextField();

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(6, 1));

		//======== panel1 ========
		{

			// JFormDesigner evaluation mark
			panel1.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


			//---- label1 ----
			label1.setText("\u0422\u0435\u043c\u043f\u0435\u0440\u0430\u0442\u0443\u0440\u0430 \u043d\u0435\u0439\u0442\u0440\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u0441\u043b\u043e\u044f");

			//---- textField1 ----
			textField1.setText("11");
			textField1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					textField1ActionPerformed(e);
				}
			});

			GroupLayout panel1Layout = new GroupLayout(panel1);
			panel1.setLayout(panel1Layout);
			panel1Layout.setHorizontalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addGap(5, 5, 5)
						.addComponent(label1)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
			);
			panel1Layout.setVerticalGroup(
				panel1Layout.createParallelGroup()
					.addGroup(panel1Layout.createSequentialGroup()
						.addGap(5, 5, 5)
						.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label1)
							.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(13, 13, 13))
			);
		}
		contentPane.add(panel1);

		//======== panel2 ========
		{

			//---- label2 ----
			label2.setText("\u0421\u0442\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u0442\u0435\u043c\u043f\u0435\u0440\u0430\u0442\u0443\u0440\u0430 \u043d\u0430 \u0437\u0430\u0431\u043e\u0435");

			//---- textField2 ----
			textField2.setText("100");
			textField2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					textField2ActionPerformed(e);
				}
			});

			GroupLayout panel2Layout = new GroupLayout(panel2);
			panel2.setLayout(panel2Layout);
			panel2Layout.setHorizontalGroup(
				panel2Layout.createParallelGroup()
					.addGroup(panel2Layout.createSequentialGroup()
						.addGap(5, 5, 5)
						.addComponent(label2)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
			);
			panel2Layout.setVerticalGroup(
				panel2Layout.createParallelGroup()
					.addGroup(panel2Layout.createSequentialGroup()
						.addGap(5, 5, 5)
						.addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label2)
							.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(13, 13, 13))
			);
		}
		contentPane.add(panel2);

		//======== panel3 ========
		{

			//---- label3 ----
			label3.setText("\u0422\u0435\u043c\u043f\u0435\u0440\u0430\u0442\u0443\u0440\u0430 \u0432\u044b\u0445\u043e\u0434\u044f\u0449\u0435\u0433\u043e \u0431\u0443\u0440\u043e\u0432\u043e\u0433\u043e \u0440\u0430\u0441\u0442\u0432\u043e\u0440\u0430");
			label3.setLabelFor(textField3);

			//---- textField3 ----
			textField3.setText("45");
			textField3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					textField3ActionPerformed(e);
				}
			});

			GroupLayout panel3Layout = new GroupLayout(panel3);
			panel3.setLayout(panel3Layout);
			panel3Layout.setHorizontalGroup(
				panel3Layout.createParallelGroup()
					.addGroup(panel3Layout.createSequentialGroup()
						.addGap(5, 5, 5)
						.addComponent(label3)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
						.addComponent(textField3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
			);
			panel3Layout.setVerticalGroup(
				panel3Layout.createParallelGroup()
					.addGroup(panel3Layout.createSequentialGroup()
						.addGap(5, 5, 5)
						.addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label3)
							.addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(13, 13, 13))
			);
		}
		contentPane.add(panel3);

		//======== panel4 ========
		{

			//---- label4 ----
			label4.setText("\u0422\u0435\u043c\u043f\u0435\u0440\u0430\u0442\u0443\u0440\u0430 \u0437\u0430\u0442\u0432\u043e\u0440\u044f\u0435\u043c\u043e\u0433\u043e \u0440\u0430\u0441\u0442\u0432\u043e\u0440\u0430");

			//---- textField4 ----
			textField4.setText("15");
			textField4.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					textField4ActionPerformed(e);
				}
			});

			GroupLayout panel4Layout = new GroupLayout(panel4);
			panel4.setLayout(panel4Layout);
			panel4Layout.setHorizontalGroup(
				panel4Layout.createParallelGroup()
					.addGroup(panel4Layout.createSequentialGroup()
						.addGap(5, 5, 5)
						.addComponent(label4)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
						.addComponent(textField4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
			);
			panel4Layout.setVerticalGroup(
				panel4Layout.createParallelGroup()
					.addGroup(panel4Layout.createSequentialGroup()
						.addGap(5, 5, 5)
						.addGroup(panel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label4)
							.addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(13, 13, 13))
			);
		}
		contentPane.add(panel4);

		//======== panel5 ========
		{

			//---- label5 ----
			label5.setText("\u0413\u043b\u0443\u0431\u0438\u043d\u0430 \u0437\u0430\u0431\u043e\u044f");

			//---- textField5 ----
			textField5.setText("3000");
			textField5.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					textField5ActionPerformed(e);
				}
			});

			GroupLayout panel5Layout = new GroupLayout(panel5);
			panel5.setLayout(panel5Layout);
			panel5Layout.setHorizontalGroup(
				panel5Layout.createParallelGroup()
					.addGroup(panel5Layout.createSequentialGroup()
						.addGap(5, 5, 5)
						.addComponent(label5)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
						.addComponent(textField5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
			);
			panel5Layout.setVerticalGroup(
				panel5Layout.createParallelGroup()
					.addGroup(panel5Layout.createSequentialGroup()
						.addGap(5, 5, 5)
						.addGroup(panel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label5)
							.addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(13, 13, 13))
			);
		}
		contentPane.add(panel5);

		//======== panel6 ========
		{

			//---- label6 ----
			label6.setText("\u0414\u0438\u043d\u0430\u043c\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u0442\u0435\u043c\u043f\u0435\u0440\u0430\u0442\u0443\u0440\u0430 \u043d\u0430 \u0437\u0430\u0431\u043e\u0435");

			//---- textField6 ----
			textField6.setPreferredSize(new Dimension(40, 20));

			GroupLayout panel6Layout = new GroupLayout(panel6);
			panel6.setLayout(panel6Layout);
			panel6Layout.setHorizontalGroup(
				panel6Layout.createParallelGroup()
					.addGroup(panel6Layout.createSequentialGroup()
						.addGap(5, 5, 5)
						.addComponent(label6)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
						.addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
			);
			panel6Layout.setVerticalGroup(
				panel6Layout.createParallelGroup()
					.addGroup(panel6Layout.createSequentialGroup()
						.addGap(5, 5, 5)
						.addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(label6)
							.addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(13, 13, 13))
			);
		}
		contentPane.add(panel6);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Aleksandr Krivoshey
	private JPanel panel1;
	private JLabel label1;
	private JTextField textField1;
	private JPanel panel2;
	private JLabel label2;
	private JTextField textField2;
	private JPanel panel3;
	private JLabel label3;
	private JTextField textField3;
	private JPanel panel4;
	private JLabel label4;
	private JTextField textField4;
	private JPanel panel5;
	private JLabel label5;
	private JTextField textField5;
	private JPanel panel6;
	private JLabel label6;
	private JTextField textField6;
	// JFormDesigner - End of variables declaration  //GEN-END:variables

	public static void main(String[] args){
		Temp2 window = new Temp2();
		window.setVisible(true);
		String beginvalue = calculate_dinamic(tnt, tzb, tzr, hz).toString();
		window.textField6.setText(beginvalue);
	}

}



