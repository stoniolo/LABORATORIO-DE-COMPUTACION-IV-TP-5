package tp5;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;

public class Main {
	
	private static DefaultListModel <Movies> listModel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {//INSTANCIO EL LISTMODEL
					listModel = new DefaultListModel<Movies>();
					Main_Frame frame = new Main_Frame();					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
