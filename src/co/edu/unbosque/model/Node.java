package co.edu.unbosque.model;

public class Node {

	private Node next;
	private int pow;
	private int coef;

	public Node(int coef, int pow) {
		this.coef = coef;
		this.pow = pow;
		next = null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getPow() {
		return pow;
	}

	public void setPow(int pow) {
		this.pow = pow;
	}

	public int getCoef() {
		return coef;
	}

	public void setCoef(int coef) {
		this.coef = coef;
	}

}
