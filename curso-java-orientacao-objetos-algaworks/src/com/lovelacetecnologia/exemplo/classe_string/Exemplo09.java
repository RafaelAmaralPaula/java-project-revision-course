package com.lovelacetecnologia.exemplo.classe_string;

public class Exemplo09 {

	public static void main(String[] args) {
		
		String s = "algaworks_cursos_online_e_gratuitos";
		
		String arrays [] = s.split("_");
		
		for(int i = 0 ; i < arrays.length ; i++) {
			
			System.out.println("[ " + i + " ]=" + arrays[i]  );
			
		}
		
		
	}

}
