package com.lovelacetecnologia.introducao_generics;

import java.util.List;

public class TesteRetirarElementos {

	public static <T> T retirar(List<T> lista) {
		return lista.get(0);

	}

}
