package es.ubu.inf.edat.pract00.demo;

public class PruebaDebugger {

	/**
	 * Metodo principal para la prueba del debugging.
	 * 
	 * Para ejecutar tests NO es obligatorio definir un metodo main.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Instacia de la clase para hacer "debug"
		ClaseParaDepurar clase = new ClaseParaDepurar();

		// Llmada al metodo de la clase 
		double valor = clase.echaCuentasBueno();
		System.out.println("Sale: "+valor);
	}

}
