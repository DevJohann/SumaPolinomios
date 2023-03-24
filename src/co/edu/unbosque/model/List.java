package co.edu.unbosque.model;

public class List {

	private Node root1;
	private Node root2;
	private Node rootResult;

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
				if (auxList1.getPow() == auxList2.getPow()) { // Caso en que exponentes coincidan, coeficientes se suman
					int res = auxList1.getCoef() + auxList2.getCoef();
					insertToFinalResult(res, auxList1.getPow());
				} // else { // Si no coinciden, no se suman y se añade a la lista igual
					// insertToFinalResult(auxList2.getCoef(), auxList2.getPow());
					// }
				auxList2 = auxList2.getNext();
			}
			auxList2 = root2;
			auxList1 = auxList1.getNext();
		}
	}

}
