package co.edu.unbosque.model;

import javax.swing.JOptionPane;

public class List {

	private Node root1;
	private Node root2;
	private Node rootResult;

	public List() {
		root1 = null;
		root2 = null;
	}

	public void displayResult() {
		Node aux = rootResult;
		String str = "";
		while (aux != null) {
			str += (aux.getCoef() + "x^" + aux.getPow() + " + ");
			aux = aux.getNext();
		}
		JOptionPane.showMessageDialog(null, str);
		System.out.println(str);
	}

	public void insertToFinal1(int coef, int pow) {
		Node newNode = new Node(coef, pow);
		Node aux = root1;
		if (root1 == null) {
			root1 = newNode;
		} else {
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(newNode);
		}
	}

	public void insertToFinal2(int coef, int pow) {
		Node newNode = new Node(coef, pow);
		Node aux = root2;
		if (root2 == null) {
			root2 = newNode;
		} else {
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(newNode);
		}
	}

	public void insertToFinalResult(int coef, int pow) {
		Node newNode = new Node(coef, pow);
		Node aux = rootResult;
		if (rootResult == null) {
			rootResult = newNode;
		} else {
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(newNode);
		}
	}

	public void showList1() {
		Node aux = root1;
		while (aux != null) {
			System.out.println(aux.getCoef() + "^" + aux.getPow());
			aux = aux.getNext();
		}
	}

	public void showList2() {
		Node aux = root2;
		while (aux != null) {
			System.out.println(aux.getCoef() + "^" + aux.getPow());
			aux = aux.getNext();
		}
	}

	public void showListFinal() {
		Node aux = rootResult;
		while (aux != null) {
			System.out.println(aux.getCoef() + "^" + aux.getPow());
			aux = aux.getNext();
		}
	}

	public void sumLists() {
		Node auxList1 = root1;
		Node auxList2 = root2;

		while (auxList1 != null) {
			System.out.println("Comparando " + auxList1.getCoef());
			while (auxList2 != null) {
				System.out.println("Con " + auxList2.getCoef());
				if ((auxList1.getPow() == auxList2.getPow()) && (!auxList1.isReady() && !auxList2.isReady())) { // Caso
					// coincidan, coeficientes
					// se suman
					int res = auxList1.getCoef() + auxList2.getCoef();
					insertToFinalResult(res, auxList1.getPow());
					auxList1.setReady(true);
					auxList2.setReady(true);
				}
				auxList2 = auxList2.getNext();
			}
			auxList2 = root2;
			auxList1 = auxList1.getNext();
		}
		// Recoger los que se quedaron en false
		auxList1 = root1;
		auxList2 = root2;
		while (auxList1 != null) {
			if (!auxList1.isReady()) {
				insertToFinalResult(auxList1.getCoef(), auxList1.getPow());
			}
			auxList1 = auxList1.getNext();
		}
		while (auxList2 != null) {
			if (!auxList2.isReady()) {
				insertToFinalResult(auxList2.getCoef(), auxList2.getPow());
			}
			auxList2 = auxList2.getNext();
		}
	}

}
