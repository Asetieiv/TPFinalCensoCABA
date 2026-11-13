package visual;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import modelo.SituacionLaboral;
public class JPAgregarPersonas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfNombre;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public JPAgregarPersonas() {
		setBackground(new Color(192, 185, 215));
		setBounds(100, 100, 704, 533);
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setBounds(50, 115, 127, 24);
		add(lblNombre);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDni.setBounds(50, 175, 215, 25);
		add(lblDni);
		
		JLabel lblFechaNac = new JLabel("Fecha de nacimiento");
		lblFechaNac.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFechaNac.setBounds(50, 235, 127, 24);
		add(lblFechaNac);
		
		JLabel lblSituacion = new JLabel("Situación laboral");
		lblSituacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSituacion.setBounds(50, 295, 215, 20);
		add(lblSituacion);
		
		JLabel lblBarrio = new JLabel("Barrio");
		lblBarrio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBarrio.setBounds(50, 349, 82, 21);
		add(lblBarrio);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(180, 117, 122, 25);
		add(tfNombre);
		tfNombre.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(156, 409, 170, 39);
		add(btnNewButton);
		
		JLabel lblTitulo = new JLabel("Agregar personas");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTitulo.setBounds(31, 39, 234, 32);
		add(lblTitulo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(180, 177, 122, 25);
		add(textField_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(180, 237, 122, 25);
		add(textField);
		
		JComboBox cbSituacion = new JComboBox();
		cbSituacion.setBounds(180, 293, 122, 24);
		add(cbSituacion);
		cbSituacion.addItem(SituacionLaboral.DESOCUPADO);
		cbSituacion.addItem(SituacionLaboral.OCUPADO);
		cbSituacion.addItem(SituacionLaboral.SUBOCUPADO);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(180, 346, 122, 24);
		add(comboBox_1);
	}
}
