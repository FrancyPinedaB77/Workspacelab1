package prueba;

import java.util.HashMap;

public class contarPalabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prueba("hola mundo mundo");
	}
	
	public static void prueba(String value)
	{
		HashMap<String, Integer> palabrasLinea=new HashMap<String, Integer>();
		String[] palabras = value.toString().split("([().,!?:;'\"-]|\\s)+");
		for(String palabra:palabras){
			String lw=palabra.toLowerCase().trim();
			if(lw.equals("")){continue;} //No queremos contar espacios
			//Si la palabra existe en el hashmap incrementa en 1 su valor,
			//en caso contrario la agrega y le asigna 1.
			palabrasLinea.put(lw,palabrasLinea.containsKey(lw)?
							(palabrasLinea.get(lw)+1)
							:1);
		
		}
		
	}

}
