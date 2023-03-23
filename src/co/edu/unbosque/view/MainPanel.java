package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel{
	
	private JLabel title;
	private Font newFont = new Font("cooper black", 0, 12);
	
	//Titulos para coeficiente y exponente uno
	private JLabel coefLabel1, powLabel1;
	
	//Titulos para coeficiente y exponente dos
	private JLabel coefLabel2, powLabel2;
	
	//Boton que hace la operacion y comprueba formato
	private JButton sumButton;
	
	//Campos de texto del primer polinomio (base)
	private JTextField coefField11, coefField12, coefField13; 
	
	//Campos de texto del primer polinomio (exponente)
	private JTextField powField11, powField12, powField13;
	
	//Campos de texto del segundo polinomio (base)
	private JTextField coefField21, coefField22, coefField23;
	
	//Campos de texto del segundo polinomio (exponente)
	private JTextField powField21, powField22, powField23;

	public MainPanel() {
		setLayout(null);
		execute();
		setVisible(true);
		setBackground(Color.LIGHT_GRAY);
	}
	
	public void execute() {
		title = new JLabel("Suma de polinomios");
		title.setFont(new Font("cooper black", Font.BOLD, 20));
		title.setBounds(190, 20, 250, 50);
		add(title);
		
		sumButton = new JButton("Sumar");
		sumButton.setBounds(240, 310, 100, 30);
		add(sumButton);
		
		//Titulos para coeficiente y exponente uno
		coefLabel1 = new JLabel("Coeficiente 1");
		coefLabel1.setBounds(62, 110, 100, 30);
		coefLabel1.setFont(newFont);
		add(coefLabel1);
		
		powLabel1 = new JLabel("Exponente 1");
		powLabel1.setBounds(154, 110, 100, 30);
		powLabel1.setFont(newFont);
		add(powLabel1);
		
		//Titulos para coeficiente y exponente dos
		coefLabel2 = new JLabel("Coeficiente 2");
		coefLabel2.setBounds(350, 110, 100, 30);
		coefLabel2.setFont(newFont);
		add(coefLabel2);
		
		powLabel2 = new JLabel("Exponente 2");
		powLabel2.setBounds(438, 110, 100, 30);
		powLabel2.setFont(newFont);
		add(powLabel2);
		
		//Campos de texto del primer polinomio (base)
		coefField11 = new JTextField();
		coefField11.setBounds(80, 140, 50, 20);
		add(coefField11);
		
		coefField12 = new JTextField();
		coefField12.setBounds(80, 190, 50, 20);
		add(coefField12);
		
		coefField13 = new JTextField();
		coefField13.setBounds(80, 240, 50, 20);
		add(coefField13);
		
		//Campos de texto del primer polinomio (exponente)
		powField11 = new JTextField();
		powField11.setBounds(160, 140, 50, 20);
		add(powField11);
		
		powField12 = new JTextField();
		powField12.setBounds(160, 190, 50, 20);
		add(powField12);
	
		powField13 = new JTextField();
		powField13.setBounds(160, 240, 50, 20);
		add(powField13);
		
		//Campos de texto del segundo polinomio (base)
		coefField21 = new JTextField();
		coefField21.setBounds(365, 140, 50, 20);
		add(coefField21);
		
		coefField22 = new JTextField();
		coefField22.setBounds(365, 190, 50, 20);
		add(coefField22);
		
		coefField23 = new JTextField();
		coefField23.setBounds(365, 240, 50, 20);
		add(coefField23);
		
		//Campos de texto del segundo polinomio (exponente)
		powField21 = new JTextField();
		powField21.setBounds(445, 140, 50, 20);
		add(powField21);
		
		powField22 = new JTextField();
		powField22.setBounds(445, 190, 50, 20);
		add(powField22);
		
		powField23 = new JTextField();
		powField23.setBounds(445, 240, 50, 20);
		add(powField23);
	}

	public JButton getSumButton() {
		return sumButton;
	}

	public void setSumButton(JButton sumButton) {
		this.sumButton = sumButton;
	}

	public JTextField getCoefField11() {
		return coefField11;
	}

	public void setCoefField11(JTextField coefField11) {
		this.coefField11 = coefField11;
	}

	public JTextField getCoefField12() {
		return coefField12;
	}

	public void setCoefField12(JTextField coefField12) {
		this.coefField12 = coefField12;
	}

	public JTextField getCoefField13() {
		return coefField13;
	}

	public void setCoefField13(JTextField coefField13) {
		this.coefField13 = coefField13;
	}

	public JTextField getPowField11() {
		return powField11;
	}

	public void setPowField11(JTextField powField11) {
		this.powField11 = powField11;
	}

	public JTextField getPowField12() {
		return powField12;
	}

	public void setPowField12(JTextField powField12) {
		this.powField12 = powField12;
	}

	public JTextField getPowField13() {
		return powField13;
	}

	public void setPowField13(JTextField powField13) {
		this.powField13 = powField13;
	}

	public JTextField getCoefField21() {
		return coefField21;
	}

	public void setCoefField21(JTextField coefField21) {
		this.coefField21 = coefField21;
	}

	public JTextField getCoefField22() {
		return coefField22;
	}

	public void setCoefField22(JTextField coefField22) {
		this.coefField22 = coefField22;
	}

	public JTextField getCoefField23() {
		return coefField23;
	}

	public void setCoefField23(JTextField coefField23) {
		this.coefField23 = coefField23;
	}

	public JTextField getPowField21() {
		return powField21;
	}

	public void setPowField21(JTextField powField21) {
		this.powField21 = powField21;
	}

	public JTextField getPowField22() {
		return powField22;
	}

	public void setPowField22(JTextField powField22) {
		this.powField22 = powField22;
	}

	public JTextField getPowField23() {
		return powField23;
	}

	public void setPowField23(JTextField powField23) {
		this.powField23 = powField23;
	}

}
