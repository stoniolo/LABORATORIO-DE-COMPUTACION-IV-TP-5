package tp5;

import javax.swing.JPanel;
import java.awt.List;
import javax.swing.JLabel;

public class ListAll_Panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ListAll_Panel() {
		setLayout(null);
		
		List list = new List();
		list.setBounds(34, 30, 367, 166);
		add(list);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setBounds(200, 11, 78, 14);
		add(lblPeliculas);

	}
}
