package co.edu.unbosque.controller;

import co.edu.unbosque.model.CheckFormat;
import co.edu.unbosque.model.List;
import co.edu.unbosque.view.MainView;

public class Controller {

	private List list;
	private MainView view;

	public Controller() {
		list = new List();
		view = new MainView();
		execute();
	}

	public void execute() {

		list.insertToFinal1(2, 3);
		list.insertToFinal1(3, 5);
		list.insertToFinal1(5, 7);

		list.showList1();
		
	}

}
