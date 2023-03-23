package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.CheckFormat;
import co.edu.unbosque.model.List;
import co.edu.unbosque.view.MainView;

public class Controller implements ActionListener{

	private List list;
	private MainView view;

	public Controller() {
		list = new List();
		view = new MainView();
		setListeners();
		execute();
	}
	
	public void setListeners() {
		view.getMainPanel().getSumButton().addActionListener(this);
	}

	public void execute() {

		list.insertToFinal1(2, 3);
		list.insertToFinal1(3, 5);
		list.insertToFinal1(5, 7);

		list.showList1();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		
		case "Sumar":
			String pow11 = view.getMainPanel().getPowField11().getText();
			String pow12 = view.getMainPanel().getPowField12().getText();
			String pow13 = view.getMainPanel().getPowField13().getText();
			String pow21 = view.getMainPanel().getPowField21().getText();
			String pow22 = view.getMainPanel().getPowField22().getText();
			String pow23 = view.getMainPanel().getPowField23().getText();
			
			String coef11 = view.getMainPanel().getCoefField11().getText();
			String coef12 = view.getMainPanel().getCoefField12().getText();
			String coef13 = view.getMainPanel().getCoefField13().getText();
			String coef21 = view.getMainPanel().getCoefField21().getText();
			String coef22 = view.getMainPanel().getCoefField22().getText();
			String coef23 = view.getMainPanel().getCoefField23().getText();
			
			if(CheckFormat.letterFormat(pow11, pow12, pow13, pow21, pow22, pow23, coef11, coef12, coef13, coef21, coef22, coef23)) {
				JOptionPane.showMessageDialog(null, "Todo good");
			}else {
				JOptionPane.showMessageDialog(null, "Debe ingresar números en los campos");
			}
			
			break;
		default:
			System.out.println("Error");
			break;
		
		}
	}

}
