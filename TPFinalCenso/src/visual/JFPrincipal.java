package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFPrincipal frame = new JFPrincipal();
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
	public JFPrincipal() {
		getContentPane().setBackground(new Color(192, 185, 215));
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 533);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton BAgregarPersona = new JButton("Agregar persona");
		BAgregarPersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(BAgregarPersona);
		
		JButton btnNewButton_1 = new JButton("New button");
		menuBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		menuBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		menuBar.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("New button");
		menuBar.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("New button");
		menuBar.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		menuBar.add(btnNewButton_5);

	}
}
