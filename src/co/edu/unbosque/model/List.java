package co.edu.unbosque.model;

public class List {

	private Node root1;
	private Node root2;

	public List() {
		root1 = null;
		root2 = null;
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

}
