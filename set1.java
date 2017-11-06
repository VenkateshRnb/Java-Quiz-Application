package javaquizzapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.Action;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class set1 extends JFrame {
	 final JRadioButton op1;
	 final JRadioButton op2;
	 final JRadioButton op3;
	 final JRadioButton op4;
	 ButtonGroup group;
	static int flag;
	String man;
	int s;                          //it maintains current score 
	String n;                       //Stores the name of test-taker which is taken as input at first welcome screem
	void read(String name , int score )
	{
		n=name;
		s=score;
		
	}
	int flagstatus()
	{
		return flag;              //If selected option is correct answer then flag is set '1', else '0'
	}
	private JPanel contentPane;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					set1 frame = new set1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public set1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuestion = new JLabel("QUESTION 1");
		lblQuestion.setBounds(10, 11, 82, 14);
		contentPane.add(lblQuestion);
		
		JLabel lblWhoInventedJava = new JLabel("Who Invented JAVA ?");    //Question
		lblWhoInventedJava.setBounds(20, 36, 151, 14);
		contentPane.add(lblWhoInventedJava);
		
		JLabel lblYourPoints = new JLabel("Your Points : "+s);     //Displays current score of the User
		lblYourPoints.setBounds(309, 11, 115, 14);
		contentPane.add(lblYourPoints);
		
		op1= new JRadioButton("Bjarne Stroustrup");              //Option-1 (Checkbox)
		
		
		op2= new JRadioButton("Dennis Ritchie");                 //Option-2 (Checkbox)
		
		
		op3= new JRadioButton("James Gosling");                 //Option-3 (Checkbox)
		op3.addActionListener(new ActionListener() {            
			public void actionPerformed(ActionEvent e) {
				if(op3.isSelected())            
					flag=1;                                           // A correct option sets the flag to '1', which is used to increment the score
			}
		});
		

		op4= new JRadioButton("Guido van Rossum");            //Option-4 (Checkbox)
		
		
		op1.setBounds(11,73,160,14);
		op2.setBounds(10,109,160,14);
		op3.setBounds(10,143,150,14);
		op4.setBounds(10,176,150,14);
		
		contentPane.add(op1);
		contentPane.add(op2);
		contentPane.add(op3);
		contentPane.add(op4);
		
		group = new ButtonGroup();
		group.add(op1);
		group.add(op2);
		group.add(op3);
		group.add(op4);
		
		
		
		
	
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				set1_2 obj = new set1_2();
				
			
				obj.read(n, s, flag);
				obj.setVisible(true);
				dispose();
			}
		});
		btnNext.setBounds(164, 227, 89, 23);
		contentPane.add(btnNext);
		
		
		
		
		
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
