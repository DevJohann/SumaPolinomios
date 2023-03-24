package co.edu.unbosque.model;

public class CheckFormat {

	public CheckFormat() {

	}

	// Metodo para comprobar que una cadena está compuesta por solo numeros
	// Tambien comprueba que hay minimo de un numero y maximo dos
	public static boolean letterFormat(String str) {
//		String str = String.valueOf(num);
		return str.matches("[0-9]{1,2}");
	}

	public static boolean letterFormat(String str, String str2, String str3, String str4, String str5, String str6,
			String str7, String str8, String str9, String str10, String str11, String str12) {
//		String str = String.valueOf(num);
		return str.matches("[0-9]{1,2}") && str2.matches("[0-9]{1,2}") && str3.matches("[0-9]{1,2}")
				&& str4.matches("[0-9]{1,2}") && str5.matches("[0-9]{1,2}") && str6.matches("[0-9]{1,2}")
				&& str6.matches("[0-9]{1,2}") && str7.matches("[0-9]{1,2}") && str8.matches("[0-9]{1,2}")
				&& str9.matches("[0-9]{1,2}") && str10.matches("[0-9]{1,2}") && str11.matches("[0-9]{1,2}")
				&& str12.matches("[0-9]{1,2}");
	}
}
