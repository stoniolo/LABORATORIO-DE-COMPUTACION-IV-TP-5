package tp5;

import javax.swing.JPanel;
import java.awt.List;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class ListAll_Panel extends JPanel {
	
	private JList list;
	
	/**
	 * Create the panel.
	 */
	public ListAll_Panel(DefaultListModel<Movies> a) {
		setLayout(null);
		
		JLabel lblPeliculas = new JLabel("Peliculas:");
		lblPeliculas.setBounds(187, 23, 60, 14);
		add(lblPeliculas);
		
		list = new JList();
		list.setBounds(42, 48, 367, 217);
		list.setModel(a);
		add(list);

	}
}
