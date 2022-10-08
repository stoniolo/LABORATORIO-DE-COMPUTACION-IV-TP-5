package tp5;

import javax.swing.JPanel;
import java.awt.List;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class ListAll_Panel extends JPanel {
	
	private DefaultListModel<Movies> listModel;

	/**
	 * Create the panel.
	 */
	public ListAll_Panel() {
		setLayout(null);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setBounds(200, 11, 78, 14);
		add(lblPeliculas);
		
		JList list = new JList();
		list.setBounds(427, 164, -387, -129);
		list.setModel(listModel);
		add(list);

	}
	
	public void setDefaultListModel(DefaultListModel<Movies> listModelRecibido)
	{
		this.listModel = listModelRecibido;
	}
}
