package es.ubu.inf.edat.pract00.demo;
/**
 * Di
 */
import java.util.LinkedList;
import java.util.List;

public class ClaseParaDepurar {

	private double suma;
	private List<Double> lista;

	/**
	 * Constructor por defecto de la clase.
	 * Modificado para insertar un mensaje cuando se haya construido.
	 */
	public ClaseParaDepurar() {
		System.out.println("construyendo clase");
	}

	/**
	 * Metodo para sumar los 100 primeros numeros enteros 
	 * 
	 * @return
	 */

	public double echaCuentasBueno() {
		lista = new LinkedList<Double>();
		for (int i = 0; i<100;i++){
			lista.add((double)i);
		}
		suma = 0.0;
		for (Double valor : lista){
			suma +=valor;
		}
		return suma;
	}
	
	/**
	 * Metodo que devuelve..
	 * @param intA
	 * @return
	 */
	public String estoEsUnaPrueba(Integer intA) {
		return intA.toString();
	}
}

