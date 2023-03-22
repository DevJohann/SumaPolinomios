package co.edu.unbosque.controller;

import co.edu.unbosque.model.List;

public class Controller {

	private List list;

	public Controller() {
		list = new List();
		execute();
	}

	public void execute() {

		list.insertToFinal1(2, 3);
		list.insertToFinal1(3, 5);
		list.insertToFinal1(5, 7);

		list.showList1();

	}

}
