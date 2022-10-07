package tp5;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add_Window extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox<Genres> comboBox;
	
	/**
	 * Create the panel.
	 */
	public Add_Window() {
		setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(103, 31, 46, 14);
		add(lblId);
		
		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setBounds(103, 60, 46, 14);
		add(lblTitulo);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(103, 85, 46, 14);
		add(lblGenero);
		
		comboBox = new JComboBox<Genres>();
		comboBox.setBounds(183, 84, 125, 20);
		add(comboBox);
		
		//Add genres >> 
		comboBox.addItem(new Genres(0,"Seleccione un genero"));
		comboBox.addItem(new Genres(1,"Terror"));
		comboBox.addItem(new Genres(2,"Accion"));
		comboBox.addItem(new Genres(3,"Suspenso"));
		comboBox.addItem(new Genres(4,"Romance"));
		
		textField = new JTextField();
		textField.setBounds(183, 57, 125, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(183, 28, 125, 20);
		add(textField_1);
		
		//Clear editable fields >>
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				comboBox.setSelectedIndex(0);
			}
		});
		btnLimpiar.setBounds(124, 145, 89, 23);
		add(btnLimpiar);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/////////////
				//ADD MOVIE//
				/////////////
				
			}
		});
		btnAgregar.setBounds(223, 145, 89, 23);
		add(btnAgregar);
		
		
	}
}
