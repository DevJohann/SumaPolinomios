package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainView extends JFrame {
	
	private MainPanel mainPanel;

	public MainView() {
		
		mainPanel = new MainPanel();
		getContentPane().add(mainPanel, BorderLayout.CENTER);
	//	getContentPane().setLayout(null);
		setTitle("Suma de polinomios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

	}

}
