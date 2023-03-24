package co.edu.unbosque.model;

public class CheckFormat {

	public CheckFormat() {

	}

	// Metodo para comprobar que una cadena está compuesta por solo numeros
	// Tambien comprueba que hay minimo de un numero y maximo dos
	public static boolean letterFormat(String str) {
//		String str = String.valueOf(num);
		return str.matches("^-?[0-9]+${1,20}");
	}

	public static boolean letterFormat(String str, String str2, String str3, String str4, String str5, String str6,
			String str7, String str8, String str9, String str10, String str11, String str12) {
//		String str = String.valueOf(num);
		return str.matches("^-?[0-9]+${1,20}") && str2.matches("^-?[0-9]+${1,20}") && str3.matches("^-?[0-9]+${1,20}")
				&& str4.matches("^-?[0-9]+${1,20}") && str5.matches("^-?[0-9]+${1,20}")
				&& str6.matches("^-?[0-9]+${1,20}") && str6.matches("^-?[0-9]+${1,20}")
				&& str7.matches("^-?[0-9]+${1,20}") && str8.matches("^-?[0-9]+${1,20}")
				&& str9.matches("^-?[0-9]+${1,20}") && str10.matches("^-?[0-9]+${1,20}")
				&& str11.matches("^-?[0-9]+${1,20}") && str12.matches("^-?[0-9]+${1,20}");
	}
}
