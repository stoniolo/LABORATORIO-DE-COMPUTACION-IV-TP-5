package tp5;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add_Panel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox<Genres> comboBox;
	private Movies auxMovie;
	private DefaultComboBoxModel<Genres> dcbModel;
	/**
	 * Create the panel.
	 * @return 
	 */
	public Add_Panel(DefaultListModel<Movies> a) {
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
		dcbModel = new DefaultComboBoxModel<Genres>();
		dcbModel.addElement(new Genres(0,"Seleccione un genero"));
		dcbModel.addElement(new Genres(1,"Terror"));
		dcbModel.addElement(new Genres(2,"Accion"));
		dcbModel.addElement(new Genres(3,"Suspenso"));
		dcbModel.addElement(new Genres(4,"Romance"));
		comboBox.setModel(dcbModel);
		
		
		textField = new JTextField();
		textField.setBounds(183, 57, 125, 20);
		add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(183, 28, 125, 20);
		add(textField_1);
		
		auxMovie = new Movies();
		textField_1.setText(Integer.toString(auxMovie.getId()));
		
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

				auxMovie.setTitle(textField.getText());
				auxMovie.setGenre(Genres.class.cast(comboBox.getSelectedItem()));
				a.addElement(auxMovie);
				auxMovie = new Movies();
				textField_1.setText(Integer.toString(auxMovie.getId()));
			}
		});
		btnAgregar.setBounds(223, 145, 89, 23);
		add(btnAgregar);
		
	}
}
