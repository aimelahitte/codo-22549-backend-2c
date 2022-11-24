package ar.com.codoacodo.interfaces.mensajeria;

public class Mensajeria {

	public void enviarMail(String mensaje) {
		System.out.println("Enviando main : " + mensaje);
	}
	
	public void enviarHD(String mensaje) {
		System.out.println("Escribiendo en HD en /temp/ " + mensaje);
	}
	
	public void enviarADB(String mensaje) {
		System.out.println("Conectando a MYSQL");
		System.out.println("usuario root");
		System.out.println("password root");
		System.out.println("insertando en tablexyz ");
		System.out.println("insert into tablexyz ...");
	}
}
