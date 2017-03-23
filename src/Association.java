import java.util.HashMap;

/**
 * Realiza la asociaci�n de palabras del diccionario, con la palabra en ingl�s como llave
 * y la palabra en espa�ol como valor.
 * @author Alejandro V�squez, Emilio D�az
 * @param <K> Llave gen�rica
 * @param <V> Valor gen�rico
 */

public class Association <K,V>{
	private HashMap<K,V> asociacion;
	
	public Association(){
		asociacion = new HashMap<K,V>();
	}
	
	/**
	 * Pone una palabra en ingl�s y su traducci�n a espa�ol en una asociaci�n
	 * @param llave, palabra en ingl�s
	 * @param valor, palabra en espa�ol
	 */
	
	public void put(K llave, V valor){
		asociacion.put(llave, valor);
	}
	
	/**
	 * Devuelve la traducci�n de una palabra de ingl�s a espa�ol
	 * @param llave, que es la palabra en ingl�s
	 * @return la palabra en espa�ol
	 */
	
	public V get(Object llave){
		return asociacion.get(llave);
	}
	
	
	/**Ve si la lista de asociaciones se encuentra vac�a
	 * @return true si la lista se encuentra vac�a
	 * */
	
	public boolean isEmpty(){
		return asociacion.isEmpty();
	}
	
}
