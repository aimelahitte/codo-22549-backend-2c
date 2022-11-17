package ar.com.codoacodo.buscador;

public class HomeMain {

	public static void main(String[] args) {
		//para crear un objeto de una clase cualquiera
		// Clase nombreDelObjeto = new Clase();
		
		Buscador miBuscador = new Buscador();
		//ahora miBuscador esta vivo entonces puedo 
		//ejecutar cualquiera de sus metodos publicos
		
		//primero defino cual es la clave de busqueda
		miBuscador.cambiarClave("iron man");
		
		//ejecuto metodo buscar() del objeto miBuscador
		miBuscador.buscar();
		
		//mostrar cuantos resultados hay
		System.out.println("Hemos encontrados " +miBuscador.getCantRes() + " resultados para '" + miBuscador.getClaveBusqueda() + "'");
	}

}
