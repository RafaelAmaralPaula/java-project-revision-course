package com.lovelacetecnologia.varargs;

public class ExemploVarargs {

	public static void main(String[] args) {
			
		CorreioEletronico correioEletronico = new CorreioEletronico();
		
		String emails [] = new String[2];
		
		emails[0] = "rafael@rafael.com";
		emails[1] = "rafaelamaral@rafaelamaral.com";
		
//		correioEletronico.enviarEmail(emails);
//		
//		correioEletronico.enviarEmail(new String[] {"rafaelamaral@rafaelamaral.com" , 
//				"rafaelamaral@rafaelamaral.com"});
		
		
		correioEletronico.enviarEmail("rafaelamaral@rafaelamaral.com" , "normandes.junior@junior.com" ,
				"pedro@pedro.com");
		
		
		
	
	}

}
