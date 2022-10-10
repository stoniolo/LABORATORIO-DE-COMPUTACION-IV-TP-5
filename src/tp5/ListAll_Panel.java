package tp5;

import javax.swing.JPanel;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class ListAll_Panel extends JPanel {
	
	private JList list;
	private DefaultListModel<Movies> lModel;
	/**
	 * Create the panel.
	 */
	public ListAll_Panel(TreeSet<Movies> a) {
		setLayout(null);
		
		JLabel lblPeliculas = new JLabel("Peliculas:");
		lblPeliculas.setBounds(187, 23, 60, 14);
		add(lblPeliculas);
		
		lModel = new DefaultListModel<Movies>();
		
		Iterator <Movies> it = a.iterator();
		
		while (it.hasNext()) { 
            lModel.addElement(it.next()); 
        }
		
		list = new JList();
		list.setBounds(42, 48, 367, 217);
		list.setModel(lModel);
		add(list);
		
	}
}
