package tp5;

import javax.swing.JPanel;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
		
		//Obteniendo el modelo de la lista
		DefaultListModel<Movies> model = new DefaultListModel<>();
		
		//Obteniendo la lista de Movies
		ArrayList<Movies> mov = new ArrayList<>();
		Collections.sort(mov, new Comparator<Movies>() {

			@Override
			public int compare(Movies o1, Movies o2) {
				//Comparando el Titulo
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});
		
		list = new JList();
		list.setBounds(42, 48, 367, 217);
		list.setModel(a);
		add(list);

	}
}
