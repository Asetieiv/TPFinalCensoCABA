package visual;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class JPVerPersonas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField tfBuscarNombre;
	private JButton btnAgregar;
	private JButton btnEliminar;
	private JButton btnActualizar;

	/**
	 * Create the panel.
	 */
	public JPVerPersonas() {
		setBackground(new Color(192, 185, 215));
		setBounds(100, 100, 704, 533);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 178, 386, 264);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		tfBuscarNombre = new JTextField();
		tfBuscarNombre.setText("Ingrese el nombre");
		tfBuscarNombre.setColumns(10);
		tfBuscarNombre.setBounds(185, 108, 159, 25);
		add(tfBuscarNombre);
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBuscar.setBounds(81, 109, 109, 19);
		add(lblBuscar);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAgregar.setBounds(499, 178, 149, 39);
		add(btnAgregar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEliminar.setBounds(499, 247, 149, 39);
		add(btnEliminar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnActualizar.setBounds(499, 320, 149, 39);
		add(btnActualizar);
	}
}
