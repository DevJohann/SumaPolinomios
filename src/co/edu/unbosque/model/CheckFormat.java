package co.edu.unbosque.model;

public class CheckFormat {

	public CheckFormat() {
		
	}
	
	//Metodo para comprobar que una cadena está compuesta por solo numeros
	//Tambien comprueba que hay minimo de un numero y maximo dos
	public static boolean letterFormat(String str) {
//		String str = String.valueOf(num);
		return str.matches("[0-9]{1,2}");
	}
	
}
