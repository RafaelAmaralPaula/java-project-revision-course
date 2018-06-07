package com.lovelacetecnologia.arquivos_properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Arquivos_Properties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties properties = new Properties();
		properties.load(new FileInputStream("./config/config.properties"));
		
		
		
		
		// Conectar no bancos de dados
		String url = properties.getProperty("bancos.dados.url");
		String user = properties.getProperty("bancos.dados.user");
		String senha = properties.getProperty("bancos.dados.senha");
		
		System.err.println("CONECTANDO NO BANCO DE DADOS :");
		System.out.println("\nURL -> " + url);
		System.out.println("User  -> " + user);
		
		try {
			
			int x = 5 / 0 ;
			
		}catch (Exception e) {
			String email = properties.getProperty("email.administrador");
			System.out.println("ENVIANDO E-MAIL PARA : " + email + " INFORMANDO ERRO QUE ACONTECE \n " + e.getMessage()); 
		}
		
		
	}

}
