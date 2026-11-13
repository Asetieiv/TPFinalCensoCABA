package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.SituacionLaboral;

public class JPComunas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfSede;
	private JTextField tfNumero;
	private JTextField tfJunta;

	/**
	 * Create the panel.
	 */
	public JPComunas() {
		setBackground(new Color(192, 185, 215));
		setBounds(100, 100, 704, 533);
		setLayout(null);
		
		JLabel lblsede = new JLabel("Nombre de sede");
		lblsede.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblsede.setBounds(50, 115, 127, 24);
		add(lblsede);
		
		JLabel lblnumero = new JLabel("Número");
		lblnumero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblnumero.setBounds(50, 175, 215, 25);
		add(lblnumero);
		
		JLabel lblJuntaComunal = new JLabel("Junta comunal");
		lblJuntaComunal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblJuntaComunal.setBounds(50, 235, 127, 24);
		add(lblJuntaComunal);
		

		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(170, 352, 170, 39);
		add(btnNewButton);
		
		JLabel lblTitulo = new JLabel("Crear comuna");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTitulo.setBounds(31, 39, 234, 32);
		add(lblTitulo);
		
		tfSede = new JTextField();
		tfSede.setColumns(10);
		tfSede.setBounds(187, 117, 122, 25);
		add(tfSede);
		
		tfNumero = new JTextField();
		tfNumero.setColumns(10);
		tfNumero.setBounds(187, 175, 122, 25);
		add(tfNumero);
		
		tfJunta = new JTextField();
		tfJunta.setColumns(10);
		tfJunta.setBounds(187, 235, 122, 25);
		add(tfJunta);
		
		JButton btnVolver = new JButton("volver");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVolver.setBounds(10, 473, 133, 32);
		add(btnVolver);
		


	}

}
